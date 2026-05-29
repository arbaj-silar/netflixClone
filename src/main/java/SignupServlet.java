
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get email from form
        String email = request.getParameter("email");

        // Store email in request scope
        request.setAttribute("userEmail", email);

        // Forward to JSP page
        RequestDispatcher dispatcher =
                request.getRequestDispatcher("signup.html");

        dispatcher.forward(request, response);
    }
}