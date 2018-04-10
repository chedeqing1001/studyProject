package cn.safetys.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by linux on 2018-4-10.
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String dname = request.getParameter("dname");
        System.out.println(dname);
        response.getWriter().write(dname);
    }
}
