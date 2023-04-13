package servletsServletLogin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletLogin() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
		request.setAttribute("msg", "Informe o login e a senha corretamente!");
		
	}

}
