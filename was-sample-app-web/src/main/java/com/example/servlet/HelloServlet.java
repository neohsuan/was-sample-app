package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        
        // 獲取時間戳記作為版本標記
        String version = String.valueOf(System.currentTimeMillis());
        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello,測試測試</h1>");
        out.println("<p>Build version: " + version + "</p>");
        out.println("</body></html>");
    }
}
