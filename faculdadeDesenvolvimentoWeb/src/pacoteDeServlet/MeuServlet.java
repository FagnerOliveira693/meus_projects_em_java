package pacoteDeServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuServlet extends HttpServlet {
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response)
	
	throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			int n1 = Integer.parseInt(request.getParameter("numero1"));
			int n2 = Integer.parseInt(request.getParameter("numero2"));
			int s n1 + n2;
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet MeuServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet MeuServlet at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
			
		} finally {
			out.close();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		processRequest(request, response);

	}

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		processRequest(request, response);

	}

	@Override

	public String getServletInfo() {
		return "Short description";
	}

}
