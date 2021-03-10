package com.ltts.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Dao.PlayerDao;
import com.ltts.model.Player;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no=Integer.parseInt(request.getParameter("PlayerId"));
		String name=request.getParameter("name");
		Date pdate=Date.valueOf(request.getParameter("dateOfBirth"));
		//java.sql.Date dateOfBirth=request.getParameter("dateOfBirth");
		
		String nationality=request.getParameter("nationality");
		String skills=request.getParameter("skills");
		int runs=Integer.parseInt(request.getParameter("runs"));
		int wickets=Integer.parseInt(request.getParameter("wickets"));
		int number_of_matches=Integer.parseInt(request.getParameter("number_of_matches"));
		int teamid=Integer.parseInt(request.getParameter("teamid"));
		
		Player p=new Player(no,name,pdate,nationality,skills,runs,wickets,number_of_matches,teamid);
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		
		boolean b=false;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
