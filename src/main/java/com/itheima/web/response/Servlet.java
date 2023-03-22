package com.itheima.web.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/resp1")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1...");
        /*// 重定向
        // 1.设置响应状态码302
        response.setStatus(302);
        // 2.设置响应头Location
        response.setHeader("Location","/javaWeb/resp2");*/

        // 简化重定向代码
        // 可以重定向到任意资源 包括内部外部
        // 动态获取资源路径
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/resp2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
