package servlets.consulta_espectaculo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import publicadores.ControladorConsultaEspectaculoPublish;
import publicadores.ControladorConsultaEspectaculoPublishService;
import publicadores.ControladorConsultaEspectaculoPublishServiceLocator;
import publicadores.SinPlataformasException;

import org.json.JSONObject;


/**
 * Servlet implementation class ConsultaEspectaculo
 */
@WebServlet("/ConsultaEspectaculo")
public class ConsultaEspectaculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ConsultaEspectaculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
		List<JSONObject> plataformas = new ArrayList<JSONObject>();
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		try {
			String[] lista_plataformas = listarPlataformas();
			
                        if (lista_plataformas.length != 0) {
			
                        	for(int it = 0; it < lista_plataformas.length; it++) {
                                String name = lista_plataformas[it];
                                if(tieneEspectaculos(name)) {
                                    JSONObject plataforma = new JSONObject();
                                    plataforma.put("name", name);
                                    plataformas.add(plataforma);
                                }
                            }
                            
                        }
                        
                        if (lista_plataformas.length == 0 || plataformas.isEmpty()) {
                            JSONObject error = new JSONObject();

                            error.put("error", "No hay Espectaculos Disponibles");
                            plataformas.add(error);
                        }
			
                        out.print(plataformas);
                        out.flush();  
			
		} catch(Exception e) {
//                     JSONObject error = new JSONObject();
//
//                    error.put("error", "No hay plataformas");
//                    plataformas.add(error);
//                    out.print(plataformas);
//                    out.flush(); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected String[] listarPlataformas() throws Exception, SinPlataformasException {
		ControladorConsultaEspectaculoPublishService ccps =  new ControladorConsultaEspectaculoPublishServiceLocator();
		ControladorConsultaEspectaculoPublish p = ccps.getControladorConsultaEspectaculoPublishPort();
		
		return p.listarPlataformas();
	}
	
	protected boolean tieneEspectaculos(String nombre) throws Exception {
		ControladorConsultaEspectaculoPublishService ccps =  new ControladorConsultaEspectaculoPublishServiceLocator();
		ControladorConsultaEspectaculoPublish p = ccps.getControladorConsultaEspectaculoPublishPort();
		
		return p.listarEspectaculos(nombre).length != 0 ? true : false;
	}

}