package com.jira.board.mapper;

import com.jira.board.dto.TaskDto;
import com.jira.board.models.Task;

public class TaskMapper {

	public static Task convertDtoToTask(TaskDto taskDto) {
		
		Task task = new Task(taskDto.getId(), taskDto.getBoardId(), taskDto.getName(), 
				taskDto.getDescription(), taskDto.getAssignTo(), taskDto.getAssignBy(), taskDto.getStatus(), taskDto.getDueDate());
		
		return task;
	}
	
	public static TaskDto convertTaskToDto(Task task) {
		
		TaskDto taskDto = new TaskDto(task.getId(), task.getBoardId(), task.getName(), 
				task.getDescription(), task.getAssignTo(), task.getAssignBy(), task.getStatus(), task.getDueDate());
		
		return taskDto;
	}
	
	
}
