package com.example.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.service.ConversionService;

/**
 * Servlet implementation class IndexController
 */
@WebServlet("/home")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(IndexController.class.getCanonicalName());
	private final ConversionService conversionService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
        this.conversionService = new ConversionService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Entra al doget del servlet");
	    var units = conversionService.groupByType();
	    LOGGER.info(units.toString());
		request.setAttribute("units", units);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
