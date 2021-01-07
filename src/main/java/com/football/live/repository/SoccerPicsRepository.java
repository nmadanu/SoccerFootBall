package com.football.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.live.model.SoccerPics;

@Repository
public interface SoccerPicsRepository extends JpaRepository<SoccerPics, Integer> {
	
}
