package com.football.live.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.football.live.model.SoccerPics;
import com.football.live.service.SoccerPicsServiceImpl;
@Controller
public class FootBallController {
	
	@Autowired
	private SoccerPicsServiceImpl soccerPicsServiceImpl;
	
	@GetMapping("/")
	public String homeSoccer(Model model) {
		model.addAttribute("listSoccerPics", soccerPicsServiceImpl.getAllSoccerPics());
		return "homeSoccer";
	}
	
	@GetMapping(value = "/image/display/{id}")
	@ResponseBody
	public void showImage(@PathVariable(value = "id") int id, HttpServletResponse response)
		throws ServletException, IOException{
		SoccerPics soccerPic = soccerPicsServiceImpl.getImageById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
	    response.getOutputStream().write(soccerPic.getSpicimg());


	    response.getOutputStream().close();
	}
}
