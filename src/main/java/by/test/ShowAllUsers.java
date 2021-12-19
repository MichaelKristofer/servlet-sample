package by.test;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showAll")
public class ShowAllUsers extends HttpServlet{

    UserService userService = new UserService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> all = userService.findAll();
        String myName = (String) getServletContext().getAttribute("myName");
        for (User user : all) {
            resp.getWriter().println(user);
        }
    }
}
