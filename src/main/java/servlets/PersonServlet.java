package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/person")
public class PersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("GET method prom person servlet");
        List<String> people = new ArrayList<>();
        people.add("Fedya");
        people.add("Masha");
        people.add("Pasha");
        people.add("Katya");

        req.setAttribute("people", people);
        req.getRequestDispatcher("/person.jsp").forward(req, resp);
    }
}
