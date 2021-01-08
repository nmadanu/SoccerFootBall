package com.football.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.live.model.TournmentLeagues;

@Repository
public interface TournmentLeaguesRepository extends JpaRepository<TournmentLeagues, Integer> {

}
