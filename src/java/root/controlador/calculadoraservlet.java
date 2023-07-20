/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import root.model.CalculadoraDeInteres;

/**
 *
 * @author ivett
 */
@WebServlet(name = "calculadoraservlet", urlPatterns = {"/calculadoraservlet"})
public class calculadoraservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculadoraservlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculadoraservlet conectado at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            double capital = Double.parseDouble(request.getParameter("capital"));
            double tasaAnual = Double.parseDouble(request.getParameter("tasaAnual"));
            int numeroAnios = Integer.parseInt(request.getParameter("numeroAnios"));

            CalculadoraDeInteres calculadora = new CalculadoraDeInteres();

            calculadora.setCapital(capital);
            calculadora.setTasaInteresAnual(tasaAnual);
            calculadora.setNumeroAnios(numeroAnios);

            //realizar el calculo
            double interesSimple = calculadora.calcularInteresSimple();

            //Guardar el resultado en el atributo de la solicitud
            request.setAttribute("interesSimple", interesSimple);
            request.setAttribute("capital", (int) capital);
            request.setAttribute("tasaAnual", (int) tasaAnual);
            request.setAttribute("numeroAnios", numeroAnios);
            //redirigir la solicitud
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Ingrese valores numéricos válidos para Capital, Tasa de Interés y Número de Años.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
