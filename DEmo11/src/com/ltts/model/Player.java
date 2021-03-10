package com.ltts.model;

import java.sql.Date;

public class Player {
	private int PlayerId;
	private String name;
	private Date dateOfBirth;
	private String nationality;
	private String skills;
	private int runs;
	private int wickets;
	private int number_of_matches;
	private int teamid;
	public Player() {
		super();
	}
	public Player(int player_id, String name, Date dateOfBirth, String nationality, String skills, int runs,
			int wickets, int number_of_matches, int team_id) {
		super();
		PlayerId = player_id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.skills = skills;
		this.runs = runs;
		this.wickets = wickets;
		this.number_of_matches = number_of_matches;
		this.teamid = team_id;
	}
	public int getPlayer_id() {
		return PlayerId;
	}
	public void setPlayer_id(int player_id) {
		PlayerId = player_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getNumber_of_matches() {
		return number_of_matches;
	}
	public void setNumber_of_matches(int number_of_matches) {
		this.number_of_matches = number_of_matches;
	}
	public int getTeam_id() {
		return teamid;
	}
  public void setTeam_id(int team_id) {
		this.teamid = team_id;
	}
  @Override
	public String toString() {
		return "Player [Player_id=" + PlayerId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", nationality="
				+ nationality + ", skills=" + skills + ", runs=" + runs + ", wickets=" + wickets
				+ ", number_of_matches=" + number_of_matches + ", team_id=" + teamid + "]";
	}
}