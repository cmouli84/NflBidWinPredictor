package com.scribble.nflbid.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scribble.nflbid.models.NflBidders;
import com.scribble.nflbid.service.NflBidWinService;

@Path("/nflbidwin")
@Controller
public class BidWinController {

	@Autowired
	private NflBidWinService nflBidWinService;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public String getNflPrediction(NflBidders nflBidders)
	{
		return nflBidWinService.getNflPrediction() + " " + nflBidders.getPostValue();
	}
}
