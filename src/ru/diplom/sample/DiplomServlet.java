package ru.diplom.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 1 on 05.02.2017.
 */
@WebServlet(name = "DiplomServlet", urlPatterns = {"/a/b/c","/main/diplom"})
public class DiplomServlet extends HttpServlet {
    private String foo;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connector connector = new Connector();
        foo = connector.getConnection();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>"+foo+"</h1>");
        out.flush();
    }
}
