package com.football.live.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.live.model.SoccerPics;
import com.football.live.repository.SoccerPicsRepository;

@Service
public class SoccerPicsServiceImpl implements SoccerPicsService {

	@Autowired
	private SoccerPicsRepository soccerPicsRepository;
	
	@Override
	public List<SoccerPics> getAllSoccerPics() {
		
		return soccerPicsRepository.findAll();
	}

	@Override
	public SoccerPics getImageById(int id) {
		Optional<SoccerPics> optional = soccerPicsRepository.findById(id);
		SoccerPics imagePic = null;
		
		if(optional.isPresent()) {
			imagePic = optional.get();
		}else {
			throw new RuntimeException("Image not found for id :: "+ id);
		}
		return imagePic;
	}

}
