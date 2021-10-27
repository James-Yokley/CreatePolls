package jyokley.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jyokley.model.Poll;

@WebServlet("/DisplayPoll")
public class DisplayPoll extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayPoll() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id")); 
		List<Poll> polls = (List<Poll>) getServletContext().getAttribute("polls"); 
		Poll poll = null; 
		for(Poll p : polls)
			if(p.getId() == id) {
				poll = p;
				break; 
			}
		request.setAttribute("poll", poll);
		request.getRequestDispatcher("/WEB-INF/DisplayPoll.jsp").forward(request, response); 
	}


}
