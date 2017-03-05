package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 40417 on 2017/2/7 0007.
 */
public class _Response extends HttpServlet {
    //1.tomcat服务器把请求信息封装到httpServletRequest对象,且把响应信息封装到httpServletResponse.
//    2.tomcat服务器调用doget方法,传入request和response对象
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3.通过response对象改变响应信息
        //3.1响应行
        response.sendError(404);
        //3.2响应头
        response.setHeader("server","lixiwang");
        //3.3实体内容
            //两者输出内容相同
        response.getWriter().write("01.hello fuck");//字符格式
        response.getOutputStream().write("01.hello fuck".getBytes());//字符格式

    }
    //4.tomcat服务器把response对象的内容转换成响应格式内容,再发送给浏览器解析
}
