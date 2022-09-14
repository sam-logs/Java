package com.company.filehandling.session2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PlayerDetails implements Serializable {
	private String playerName;
	private String teamName;
	private int matchesPlayed;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public PlayerDetails(String playerName, String teamName, int matchesPlayed) {
		this.playerName = playerName;
		this.teamName = teamName;
		this.matchesPlayed = matchesPlayed;
	}
	

}
