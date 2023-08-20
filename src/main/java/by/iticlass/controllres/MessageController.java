package by.iticlass.controllres;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "MessageController", urlPatterns = "/messeg")
public class MessageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      final   HttpSession session = req.getSession();
      String sessionMessage = (String) session.getAttribute("sessionMessage");
      String reguestMessage = (String) req.getAttribute("reguestMessage");

      resp.getWriter().append("session messeg: " + sessionMessage + "\n")
              .append("regust messege: " + reguestMessage + "\n");
        resp.getWriter().append("Creation time: " + new Date(session.getCreationTime())).flush();
    }
}
