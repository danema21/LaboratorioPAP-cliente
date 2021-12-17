package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;
import publicadores.CConsultaDeFuncionDeEspectaculoPublish;
import publicadores.CConsultaDeFuncionDeEspectaculoPublishService;
import publicadores.CConsultaDeFuncionDeEspectaculoPublishServiceLocator;
import publicadores.DtFuncion;
import publicadores.SinPlataformasException;

/**
 * Servlet implementation class ConsultaFuncionDeEspectaculo
 */
@WebServlet("/ConsultaFuncionDeEspectaculo")
public class ConsultaFuncionDeEspectaculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaFuncionDeEspectaculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String estado = (String) request.getParameter("estado");
		String nomPlat = null, nomEsp = null;
		DtFuncion dtf;
		RequestDispatcher rd = null;
		
		try {
			String[] plafatormas = cargarPlataformas();
			request.setAttribute("plataformas", plafatormas);
			request.setAttribute("mostrar", "plataformas");
		} catch (SinPlataformasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (estado !=null && estado.equals("espectaculos")) {
			nomPlat = (String)request.getParameter("nomPlat");
			try {
				String[] espectaculos = cargarEspectaculos(nomPlat);
				request.setAttribute("espectaculos", espectaculos);
				request.setAttribute("mostrar", "espectaculos");
				request.setAttribute("nomPlat", nomPlat);
				rd = request.getRequestDispatcher("cfeSelectEspectaculo.jsp");
			} catch (RemoteException | ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

			
		}
		else if (estado !=null && estado.equals("funciones")) {
			nomEsp = (String)request.getParameter("nomEsp");
			nomPlat = (String)request.getParameter("nomPlat");
			try {
				String [] funciones = cargarFunciones(nomPlat, nomEsp);
				request.setAttribute("funciones", funciones);
				request.setAttribute("mostrar", "funciones");
				request.setAttribute("nomEsp", nomEsp);
				request.setAttribute("nomPlat", nomPlat);
				rd = request.getRequestDispatcher("cfeSelectFuncion.jsp");
			} catch (RemoteException | ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

		}
		
		else if(estado !=null && estado.equals("mostrarFun")) {
			nomEsp = (String)request.getParameter("nomEsp");
			nomPlat = (String)request.getParameter("nomPlat");
			String nomFun = (String)request.getParameter("nomFun");
			try {
				dtf = cargarFuncion(nomPlat, nomEsp, nomFun);
				request.setAttribute("funcion", dtf);
				rd = request.getRequestDispatcher("cfeMostrarFuncion.jsp");
			} catch (RemoteException | ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{		
			rd = request.getRequestDispatcher("cfeSelectPlataforma.jsp");
		}
		
		rd.forward(request, response);
	}
	
	public String[] cargarPlataformas() throws ServiceException, SinPlataformasException, RemoteException {
		CConsultaDeFuncionDeEspectaculoPublishService cfep = new CConsultaDeFuncionDeEspectaculoPublishServiceLocator();
		CConsultaDeFuncionDeEspectaculoPublish port = cfep.getCConsultaDeFuncionDeEspectaculoPublishPort();
		return port.listarPlataformas();
	}
	
	public String[] cargarEspectaculos(String nomPlat) throws ServiceException, RemoteException {
		CConsultaDeFuncionDeEspectaculoPublishService cfep = new CConsultaDeFuncionDeEspectaculoPublishServiceLocator();
		CConsultaDeFuncionDeEspectaculoPublish port = cfep.getCConsultaDeFuncionDeEspectaculoPublishPort();
		return port.selectPlataforma(nomPlat);
	}
	
	public String[] cargarFunciones(String nomPlat, String nomEsp) throws ServiceException, RemoteException{
		CConsultaDeFuncionDeEspectaculoPublishService cfep = new CConsultaDeFuncionDeEspectaculoPublishServiceLocator();
		CConsultaDeFuncionDeEspectaculoPublish port = cfep.getCConsultaDeFuncionDeEspectaculoPublishPort();
		return port.selectEspectaculoDePlataforma(nomPlat, nomEsp);
	}
	
	public DtFuncion cargarFuncion(String nomPlat,String nomEsp,String nomFun) throws ServiceException, RemoteException{
		CConsultaDeFuncionDeEspectaculoPublishService cfep = new CConsultaDeFuncionDeEspectaculoPublishServiceLocator();
		CConsultaDeFuncionDeEspectaculoPublish port = cfep.getCConsultaDeFuncionDeEspectaculoPublishPort();
		return port.selectFuncionDeEspectaculo(nomPlat, nomEsp, nomFun);
		
	}

}
