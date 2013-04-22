package com.ricmac.othello.api.impl;

import java.util.Random;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//a commment

@Path("/a/")
public class Othello {

	private static final char[] othellomarker = {'r', 'y', 'e'};
	private static String currentBoard = "";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getstring")
	public String getEmployee() {
		return "{\"board\" : " + getRandomBoard() + " }";
	}
	
	private String getRandomBoard() {
		String board = "\"";
		for (int i = 0; i < 64; i++ ) {
			board = board + othellomarker[new Random().nextInt(3)];
		}
		board = board + "\"";
		return board;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getBoard")
	public String getBoard() {
		return "{ \"board\" : " + "\"" + currentBoard + "\"" + " }";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/setBoard/{board}")
	public void setBoard(@PathParam("board") @DefaultValue("") String board ) {
		currentBoard = board;
	}
 	
}
