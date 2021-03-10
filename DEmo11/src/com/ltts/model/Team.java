package com.ltts.model;

public class Team {
	private int teamid;
	private String teamname;
    private String ownername;
    private String coachname;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int teamid, String teamname, String ownername, String coachname) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownername = ownername;
		this.coachname = coachname;
	}
	public int getTeam_id() {
		return teamid;
	}
	public void setTeam_id(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", ownername=" + ownername + ", coachname="
				+ coachname + "]";
	}   
}