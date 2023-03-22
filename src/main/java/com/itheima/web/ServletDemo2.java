package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*
 * 初始化方法：
 *   1.调用时机 默认情况下Servlet被第一次访问时调用
 *       loadOnStartup = 1可以更改为 在服务器启动时自动调用init方法
 *   2.调用次数 1次
 */
@WebServlet(urlPatterns = "/demo2", loadOnStartup = 1)
public class ServletDemo2 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init>>>>>>>");
    }

    /*
    * 提供服务
    *   1.每一次访问Servlet时调用该方法
    */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello word");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /*
     * 销毁方法：
     *   1.调用时机：内存释放或者服务器关闭时，Servlet对象会被销毁，调用一次
     *       loadOnStartup = 1可以更改为 在服务器启动时自动调用init方法
     *   2.调用次数 1次
     */
    @Override
    public void destroy() {
        System.out.println("destroy>>>>");
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
