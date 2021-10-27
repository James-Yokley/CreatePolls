package jyokley.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jyokley.model.Poll;

@WebServlet("/ListPolls")
public class ListPolls extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListPolls() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		super.init(config); 
		List<Poll> polls = new ArrayList<Poll>(); 
		Poll poll = new Poll(); 
		poll.setQuestion("Programming language(s)?"); 
		poll.getAnswers().add("Java"); 
		poll.getAnswers().add("Python");
		polls.add(poll); 
		getServletContext().setAttribute("polls", polls);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/ListPolls.jsp").forward(request, response);
	}


}
