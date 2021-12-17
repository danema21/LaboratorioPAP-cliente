/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.consulta_espectaculo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorConsultaEspectaculoPublish;
import publicadores.ControladorConsultaEspectaculoPublishService;
import publicadores.ControladorConsultaEspectaculoPublishServiceLocator;
import publicadores.DtEspectaculo;
import publicadores.DtFuncion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.json.JSONObject;

/**
 *
 * @author angel
 */
@WebServlet("/MostrarEspectaculo")
public class MostrarEspectaculo extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ControladorConsultaEspectaculoPublishService ccps =  new ControladorConsultaEspectaculoPublishServiceLocator();
	
    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	ControladorConsultaEspectaculoPublish p = null;
		try {
			p = ccps.getControladorConsultaEspectaculoPublishPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        res.setContentType("application/json");
        
        PrintWriter out = res.getWriter();
 
        String paramValue = req.getParameter("name");
        
        String[] nombresEspectaculos = p.listarEspectaculos(paramValue);
 
        List<JSONObject> espectaculos = new ArrayList<JSONObject>();
        //Iterator<String> it = nombresEspectaculos.iterator();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
			
        for(int it = 0; it < nombresEspectaculos.length; it++) {
            String name = nombresEspectaculos[it];
            DtEspectaculo data_espectaculo = p.mostrarDatosEspectaculos(name);
            JSONObject espectaculo = new JSONObject();
            DtFuncion[] funciones = data_espectaculo.getFunciones();
            List<JSONObject> json_funciones = new ArrayList<JSONObject>();
            
            espectaculo.put("name", data_espectaculo.getNombre());
            espectaculo.put("descripcion", data_espectaculo.getDescripcion());
            espectaculo.put("cantMinEspectadores", data_espectaculo.getCantMinEspectadores());
            espectaculo.put("cantMaxEspectadores", data_espectaculo.getCantMaxEspectadores());
            espectaculo.put("duracionMin", data_espectaculo.getDuracionMin());
            espectaculo.put("url", data_espectaculo.getUrl());
            espectaculo.put("costo", data_espectaculo.getCosto());
            espectaculo.put("fechaRegistro", formatDate(data_espectaculo.getFechaRegistro()));
            espectaculo.put("img", data_espectaculo.getUrlImg());

            if(data_espectaculo.getFunciones() != null) {
                for(int itf = 0; itf < funciones.length; itf++) {
                        DtFuncion funcion = funciones[itf];
                        JSONObject json_funcion = new JSONObject();
                        json_funcion.put("name", funcion.getNombre());
                        json_funcion.put("fecha", formatDate(funcion.getFecha()));
                        json_funcion.put("hora_inicio", funcion.getHoraInicio());
                        json_funcion.put("fecha_registro", formatDate(funcion.getFechaRegistro()));
                        json_funciones.add(json_funcion);
                }

                espectaculo.put("funciones", json_funciones);
            }

            espectaculos.add(espectaculo);
        }    
        
        
        out.print(espectaculos);
	out.flush(); 
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String formatDate(Calendar fecha) {
        return ""+fecha.get(Calendar.DAY_OF_MONTH)+"-"+((int)fecha.get(Calendar.MONTH)+1)+"-"+fecha.get(Calendar.YEAR);

    }
}
