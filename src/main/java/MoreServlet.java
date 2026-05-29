
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MoreServlet
 */

@WebServlet("/more")
public class MoreServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Default constructor
     */
    public MoreServlet() {
        super();
    }

    /**
     * Handles GET request
     */
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        // Send data to JSP
        request.setAttribute("title", "Money Heist");
        request.setAttribute("year", "2017");
        request.setAttribute("seasons", "5 Seasons");
        request.setAttribute("genre", "Crime Thriller");
        request.setAttribute("match", "98% Match");

        request.setAttribute(
            "description",
            "A criminal mastermind known as The Professor "
          + "recruits eight thieves to carry out the biggest "
          + "heist in history inside the Royal Mint of Spain."
        );

        // Forward to more.jsp
        request.getRequestDispatcher("more.html")
               .forward(request, response);
    }

    /**
     * Handles POST request
     */
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        doGet(request, response);
    }
}