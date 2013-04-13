package com.ricmac.othello.api.impl;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/a/")
public class Othello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getstring")
	public String getEmployee() {
		
		return "{\"board\" :" + getRandomBoard() + " }";
		//return "{\"board\" : \"rrwrerwyrryyyyyyyyrrrerrryyyyyyrr\"}";
	}
	
	private String getRandomBoard() {
		char[] othellomarker = {'r', 'y', 'e'};
		String board = "\"";
		for (int i = 0; i < 64; i++ ) {
			board = board + othellomarker[new Random().nextInt(3)];
		}
		board = board + "\"";
		return board;
	}
 	
}
