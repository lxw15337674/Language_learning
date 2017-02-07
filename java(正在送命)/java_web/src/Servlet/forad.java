package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 40417 on 2017/2/7 0007.
 */
public class forad extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //得到referer头
        String referer = request.getHeader("referer");
        System.out.println("referer="+referer);

//        判断非法链接:
//            1.直接访问的话referer=null;
//            2.如果当前请求不是来自广告.
        if (referer==null||!referer.contains("/ad.html")){
            response.getWriter().write("当前是非法链接.");
        }else{
            response.getWriter().write("资源正在下载..");
        }
    }
}
