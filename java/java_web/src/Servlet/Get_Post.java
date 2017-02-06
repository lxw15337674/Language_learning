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
public class Get_Post extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("POST方式");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println(name + "=" + password);

        System.out.println("=============================");
        Enumeration<String> enums = request.getParameterNames();
        while (enums.hasMoreElements()) {
            String paramName = enums.nextElement();
            String paramValue = request.getParameter(paramName);
            System.out.println(paramName + "=" + paramValue);
        }
        //一定调用doGet方法
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET方式");
        //接收GET方式提交的参数
        String value = request.getQueryString();
        System.out.println(value);

    }
}
