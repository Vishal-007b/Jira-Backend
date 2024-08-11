package com.jira.board.dto;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;

public class TaskDto implements Serializable {
	
	private Long id;
	
	private String boardId;
	
	private String name;
	
	private String description;
	
	private String assignTo;
	
	private String assignBy;
	
	private String status;
	
	private Date dueDate;

	public TaskDto() {
		super();
	}

	public TaskDto(Long id, String boardId, String name, String description, String assignTo, String assignBy, String status,
			Date dueDate) {
		super();
		this.id = id;
		this.boardId = boardId;
		this.name = name;
		this.description = description;
		this.assignTo = assignTo;
		this.assignBy = assignBy;
		this.status = status;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public String getAssignBy() {
		return assignBy;
	}

	public void setAssignBy(String assignBy) {
		this.assignBy = assignBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "TaskDto [id=" + id + ", boardId=" + boardId + ", name=" + name + ", description=" + description
				+ ", assignTo=" + assignTo + ", assignBy=" + assignBy + ", status=" + status + ", dueDate=" + dueDate
				+ "]";
	}

}
