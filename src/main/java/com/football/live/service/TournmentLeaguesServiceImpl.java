package com.football.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.football.live.model.TournmentLeagues;
import com.football.live.repository.TournmentLeaguesRepository;

@Service
public class TournmentLeaguesServiceImpl implements TournmentLeaguesService {

	@Autowired
	private TournmentLeaguesRepository tournmentLeaguesRepository;
	@Override
	public List<TournmentLeagues> getAllTournments() {
		
		return tournmentLeaguesRepository.findAll();
	}
	
	@Override
	public List<TournmentLeagues> getAllSortedTournments() {
		
		return tournmentLeaguesRepository.findAll(Sort.by(Sort.Direction.ASC, "tyear"));
	}

}
