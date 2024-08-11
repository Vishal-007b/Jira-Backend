package com.jira.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jira.board.dto.TaskDto;
import com.jira.board.models.Task;
import com.jira.board.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getAllTask/{boardId}")
	public List<Task> getAllTaskByBoardId(@PathVariable(required=true) String boardId) {
		return taskService.getAllTaskByBoardId(boardId);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/create")
	public Task createTask(@RequestBody TaskDto taskDto) {	
		System.out.println(taskDto);		
		return taskService.createTask(taskDto);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PatchMapping("/update")
	public Task updateTask(@RequestBody TaskDto taskDto) {	
		System.out.println(taskDto);
		return taskService.createTask(taskDto);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/{taskId}")
	public TaskDto getTaskById(@PathVariable(required=true) String taskId) {
		System.out.println(taskId);		
		TaskDto taskDto =  taskService.getTaskById(taskId);
		return taskDto;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/{taskId}")
	public void deleteTaskById(@PathVariable(required=true) String taskId) {
		taskService.deleteTaskById(taskId);
	}
	
}
