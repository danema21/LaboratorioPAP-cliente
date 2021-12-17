package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorIniciarSesionPublish;
import publicadores.ControladorIniciarSesionPublishService;
import publicadores.ControladorIniciarSesionPublishServiceLocator;
import publicadores.DtUsuario;

/**
 * Servlet implementation class IniciarSesion
 */
@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarSesion() {
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
		HttpSession sesion = request.getSession();
        String usu = request.getParameter("inputUser");
        String pass = request.getParameter("inputPassword");
        DtUsuario usuario = null;
        
        try {
			usuario = loguearUsuario(usu, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        if(usuario != null) {
        	sesion.setAttribute("usuario", usuario);
        	
        	Cookie c = new Cookie("userid", usu);
        	if("on".equals(request.getParameter("recordarCheckboxSinCk")) || "on".equals(request.getParameter("recordarCheckboxConCk"))) {
        	    c.setMaxAge(24*60*60);
        	    response.addCookie(c);
        	}else {
        		c.setMaxAge(0);
        		response.addCookie(c);
        	}
        	sesion.setAttribute("imagenUsuario", usuario.getUrlImg());
        	response.sendRedirect("index.jsp");
        }else {
        	RequestDispatcher rd;
        	request.setAttribute("mensaje", "Usuario o password incorrectos");
        	rd = request.getRequestDispatcher("/notificacion.jsp");
        	rd.forward(request, response);
        }
        
		doGet(request, response);
	}
	
	public DtUsuario loguearUsuario(String usu, String pass) throws Exception {
		ControladorIniciarSesionPublishService cisps = new ControladorIniciarSesionPublishServiceLocator();
		ControladorIniciarSesionPublish port = cisps.getControladorIniciarSesionPublishPort();
		return port.iniciarSesion(usu, pass);
	}
	
}
