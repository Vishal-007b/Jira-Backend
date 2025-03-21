package com.jira.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jira.board.models.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, String> {

	@Query(value = "SELECT * FROM task where board_id = ?1", nativeQuery = true)
	List<Task> getAllTaskByBoardId(String boardId);
	
}
