package com.javainuse.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	private String gameid;
	private String sid;
	private String userid;
	private String score;
	
	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}


	public JwtRequest(String username, String gameid, String sid, String userid, String score) {
		super();
		this.username = username;
		this.gameid = gameid;
		this.sid = sid;
		this.userid = userid;
		this.score = score;
	}


	@Override
	public String toString() {
		return "JwtRequest [username=" + username + ", gameid=" + gameid + ", sid=" + sid + ", userid=" + userid
				+ ", score=" + score + "]";
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the gameid
	 */
	public String getGameid() {
		return gameid;
	}


	/**
	 * @param gameid the gameid to set
	 */
	public void setGameid(String gameid) {
		this.gameid = gameid;
	}


	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}


	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}


	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}


	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}


	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}