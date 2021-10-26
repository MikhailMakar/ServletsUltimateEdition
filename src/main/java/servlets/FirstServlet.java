package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/test", "/secondURL"})
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("Get method");
        resp.getWriter().write("Hello, world!");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("INIT method");
    }

    @Override
    public void destroy() {
        log("Destroy Servlet");
        super.destroy();
    }
}
