package com.ricmac.othello.api.impl;

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
		return "{\"board\" : \"the board\"}";
	}
	
}
