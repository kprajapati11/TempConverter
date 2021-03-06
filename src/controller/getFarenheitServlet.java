package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CelciusToFahrenheit;

/**
 * Servlet implementation class getFarenheitServlet
 */
@WebServlet("/getFarenheitServlet")
public class getFarenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFarenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userCelcius = request.getParameter("userCelcius");
		CelciusToFahrenheit userTemperature = new CelciusToFahrenheit(Double.parseDouble(userCelcius));
		
		request.setAttribute("userTemp", userTemperature);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		/*
		 * PrintWriter writer = response.getWriter();
		 * writer.println(userTemperature.toString()); writer.close();
		 */
	}

}
