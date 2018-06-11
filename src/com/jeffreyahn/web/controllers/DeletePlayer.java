package com.jeffreyahn.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeffreyahn.web.models.Player;
import com.jeffreyahn.web.models.Team;

/**
 * Servlet implementation class DeletePlayer
 */
@WebServlet("/deletePlayer")
public class DeletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Team> allTeams = (ArrayList<Team>) session.getAttribute("roster");
		int teamId = Integer.parseInt(request.getParameter("id"));
		int pId = Integer.parseInt(request.getParameter("pId"));
		
		System.out.println(allTeams);
		Team currTeam = allTeams.get(teamId);
		ArrayList<Player> allPlayers = currTeam.getPlayers();
		allPlayers.remove(pId);
		allTeams.set(teamId, currTeam);
		
		session.setAttribute("roster", allTeams);
		response.sendRedirect("teams?id="+teamId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
