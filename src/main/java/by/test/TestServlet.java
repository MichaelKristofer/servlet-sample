package by.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/test", name = "CalcServlet")
public class TestServlet extends HttpServlet {

    private final Calculate calculate = new CalculateImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        double i = Double.parseDouble(num1);
        String num2 = req.getParameter("num2");
        double i1 = Double.parseDouble(num2);
        String operation = req.getParameter("operation");
        double result = 0;
        switch (operation){
            case "sum":
                result = calculate.sum(i, i1);
                break;
            case "sub":
                result = calculate.sub(i, i1);
                break;
            case "mul":
                result = calculate.mul(i, i1);
                break;
            case "div":
                result = calculate.div(i, i1);
                break;
        }
        req.setAttribute("message", "Result = " + result);
        getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
    }
}
