package com.itheima.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 响应字符数据：设置字符数据的响应体
@WebServlet("/resp3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置流的编码格式
        response.setContentType("text/html;charset=utf-8");
        // 1.获取字符输出流
        PrintWriter writer = response.getWriter();
        // response.setHeader("content-type","text/html");
        writer.write("你好");
        writer.write("<h1>bbb</a>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
