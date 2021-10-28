package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = {"/test", "/secondURL"})
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("INIT method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("Get method");
        Map<String, String[]> parameterMap = req.getParameterMap();
        String collect = parameterMap.entrySet().stream()
                .map(stringEntry -> {
                    String param = String.join("; ", stringEntry.getValue());
                    return stringEntry.getKey() + " = " + param;
                }).collect(Collectors.joining("\n"));
        resp.getWriter().write("GET method\n");
        resp.getWriter().write(collect);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("method POST");
        Map<String, String[]> parameterMap = req.getParameterMap();
        String collect = parameterMap.entrySet().stream()
                .map(stringEntry -> {
                    String param = String.join("; ", stringEntry.getValue());
                    return stringEntry.getKey() + " = " + param;
                }).collect(Collectors.joining("\n"));

        resp.getWriter().write("POST method\n");
        resp.getWriter().write(collect);
    }

    @Override
    public void destroy() {
        log("Destroy Servlet");
        super.destroy();
    }
}
