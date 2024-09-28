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
 * Servlet implementation class ConvertLengthController
 */
@WebServlet("/convert")
public class ConvertLengthController extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private final ConversionService conversionService = new ConversionService();
  private static final Logger LOGGER = Logger.getLogger(ConvertLengthController.class.getCanonicalName());


  /**
   * @see HttpServlet#HttpServlet()
   */
  public ConvertLengthController() {
    super();
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String from = request.getParameter("from");
    String to = request.getParameter("to");
    LOGGER.log(Level.INFO, String.format("%s %s to %s ", request.getParameter("value"), from, to));
    double value = Double.parseDouble(request.getParameter("value"));
    double result = conversionService.convert(from, to, value);
    LOGGER.log(Level.INFO, String.format("%f %s to %s = %f", value, from, to, result));
    request.setAttribute("result", String.format("%.2f",result));
    request.setAttribute("from", from);
    request.setAttribute("to", to);
    request.setAttribute("value", value);
    request.getRequestDispatcher("result.jsp").forward(request, response);
  }

}
