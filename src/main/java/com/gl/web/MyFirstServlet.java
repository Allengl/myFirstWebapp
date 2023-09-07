package com.gl.web;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends MyGenericServlet {
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>MyFirstServlet is called hahaha!!!!</h1>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }
}
