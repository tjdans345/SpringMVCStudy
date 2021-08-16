package hello.sevlet.basic;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class helloServlet extends HttpServlet{

    //서블릿이 호출되면 서비스가 호출된다
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("helloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String name = request.getParameter("username");
        System.out.println("username = " + name);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + name);

    }


}





