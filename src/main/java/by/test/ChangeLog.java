package by.test;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/changeLog", name = "ChangeLog")
public class ChangeLog extends HttpServlet{
    private static UserService userService = new UserService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/changeLog.jsp").forward(req, resp);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String newLogin = req.getParameter("newLogin");
        userService.changeLogin(login, newLogin);
        req.setAttribute("message", "completed");
        getServletContext().getRequestDispatcher("/changeLog.jsp").forward(req, resp);
    }
}
