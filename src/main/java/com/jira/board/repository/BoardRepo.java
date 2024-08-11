package com.jira.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jira.board.models.Board;

@Repository
public interface BoardRepo extends JpaRepository<Board, String> {

}
