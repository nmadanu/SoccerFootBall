package com.football.live.service;

import java.util.List;

import com.football.live.model.TournmentLeagues;

public interface TournmentLeaguesService {
	List<TournmentLeagues> getAllTournments();
	List<TournmentLeagues> getAllSortedTournments();
}
