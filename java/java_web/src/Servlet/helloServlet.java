package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by 40417 on 2017/2/6 0006.
 */
public class helloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求行
        System.out.println("请求方式:"+req.getMethod());
        System.out.println("URI:"+req.getRequestURI());
        System.out.println("URL:"+req.getRequestURL());
        System.out.println("http版本:"+req.getProtocol());

        //请求头
        System.out.println(req.getHeader("Host"));

        Enumeration<String> enums = req.getHeaderNames();
        while(enums.hasMoreElements()){
            String headerName = enums.nextElement();
            String headerValue = req.getHeader(headerName);
            System.out.println(headerName+": "+headerValue);
        }

        System.out.println("获取实体内容数据:"+req.getInputStream());

        resp.setContentType("text/html;charset=utf-8");
        //向浏览器输出内容
        resp.getWriter().write("这是第一个servlet程序" );
    }
}
