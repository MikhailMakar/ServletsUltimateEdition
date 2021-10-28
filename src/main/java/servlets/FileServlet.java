package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

@WebServlet("/uploadFile")
@MultipartConfig(location = "C:\\Users\\Mikhail_Makar\\IdeaProjects\\Servlets\\src\\main\\resources")
public class FileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Collection<Part> parts = req.getParts();
        for (Part part : parts) {
            part.write(UUID.randomUUID() + part.getSubmittedFileName());
        }
        resp.sendRedirect("/my-app/first");
    }
}
