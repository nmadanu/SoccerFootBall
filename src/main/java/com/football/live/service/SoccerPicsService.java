package com.football.live.service;

import java.util.List;

import com.football.live.model.SoccerPics;

public interface SoccerPicsService {
	List<SoccerPics> getAllSoccerPics();
	SoccerPics getImageById(int id);
}
