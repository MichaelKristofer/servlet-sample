package by.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/author")
public class AuthorisationServlet extends HttpServlet {

    private final UserService userService = new UserService();
    private int requestCount;

    //init
    //service
    //destroy

    //scopes:
    //application
    //session
    //request
    //page

//    @Override
//    public void init() throws ServletException {
//        System.out.println("Init");
//        getServletContext().setAttribute("myName", "Test");
//    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Service");
//    }


//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//        requestCount++;
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("Destroy");
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if(userService.containsAuth(login, password)) {
            req.getSession().setAttribute("user", userService.getByLogin(login));
            resp.sendRedirect("/");
        }
    }
}
