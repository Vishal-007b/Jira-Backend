package com.jira.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jira.board.dto.TaskDto;
import com.jira.board.models.Task;

@Service
public interface TaskService {

	public Task createTask(TaskDto taskDto);
	
	public TaskDto getTaskById(String taskId);
	
	public void deleteTaskById(String taskId);
	
	public List<Task> getAllTaskByBoardId(String boardId);
	
}
