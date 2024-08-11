package com.jira.board.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.board.dto.TaskDto;
import com.jira.board.mapper.TaskMapper;
import com.jira.board.models.Task;
import com.jira.board.repository.TaskRepo;
import com.jira.board.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepo taskRepo;

	@Override
	public Task createTask(TaskDto taskDto) {		
		Task task = TaskMapper.convertDtoToTask(taskDto);		
		return taskRepo.save(task);
	}

	@Override
	public TaskDto getTaskById(String taskId) {
		Optional<Task> task = taskRepo.findById(taskId);
		
		if (task.isPresent()) return TaskMapper.convertTaskToDto(task.get());
		
		return null;
	}

	@Override
	public List<Task> getAllTaskByBoardId(String boardId) {
		return taskRepo.getAllTaskByBoardId(boardId);
	}

	@Override
	public void deleteTaskById(String taskId) {
		taskRepo.deleteById(taskId);
	}
	
	
	
}
