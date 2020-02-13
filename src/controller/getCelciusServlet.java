package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenheitToCelcius;

/**
 * Servlet implementation class getCelciusServlet
 */
@WebServlet("/getCelciusServlet")
public class getCelciusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelciusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFarh = request.getParameter("userFarh");
		FahrenheitToCelcius userTemperatureFah = new FahrenheitToCelcius(Double.parseDouble(userFarh));
		
		request.setAttribute("userTempFah", userTemperatureFah);
		getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
		/*
		 * PrintWriter writer = response.getWriter();
		 * writer.println(userTemperature.toString()); writer.close();
		 */
	}

}
