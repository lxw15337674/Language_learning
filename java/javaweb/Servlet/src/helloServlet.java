import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
//第一个servlet程序

/**
 * Created by 40417 on 2017/2/5 0005.
 */
public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //向浏览器输出内容
        resp.getWriter().write("这是第一个servlet程序.当前时间为" + new Date());

    }
}

