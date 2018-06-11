package com.jeffreyahn.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeffreyahn.web.models.Player;
import com.jeffreyahn.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(request.getParameter("id") == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
	        view.forward(request, response);
		} else {
			int currID = Integer.parseInt(request.getParameter("id"));
			System.out.println(currID);
			@SuppressWarnings("unchecked")
			ArrayList<Team> allTeams = (ArrayList<Team>) session.getAttribute("roster");
			System.out.println(allTeams);
			Team currTeam = allTeams.get(currID);
			ArrayList<Player> allPlayers = currTeam.getPlayers();
			request.setAttribute("allPlayers", allPlayers);
			request.setAttribute("currTeam", currTeam);
			request.setAttribute("currID", currID);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/TeamInfo.jsp");
	        view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Team> allTeams = (ArrayList<Team>) session.getAttribute("roster");
		System.out.println(allTeams);
		Team newTeam = new Team(request.getParameter("teamName"));
		System.out.println(newTeam);
		
		allTeams.add(newTeam);
		session.setAttribute("roster", allTeams);
		response.sendRedirect("home");
	}

}
