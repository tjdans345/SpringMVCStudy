package hello.sevlet.basic.reqeust;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeadServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method = request.getMethod();

    }
}

