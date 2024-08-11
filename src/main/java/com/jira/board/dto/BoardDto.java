package com.jira.board.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardDto implements Serializable {

	private String id;
	
	private String name;

	@JsonProperty("statusBar")
	private String statusBars;

	public String getId() {
		return id;
	}

	public BoardDto(String id, String name, String statusBars) {
		super();
		this.id = id;
		this.name = name;
		this.statusBars = statusBars;
	}



	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStausBars() {
		return statusBars;
	}

	public void setStausBars(String statusBars) {
		this.statusBars = statusBars;
	}

	@Override
	public String toString() {
		return "BoardDto [id=" + id + ", name=" + name + ", statusBars=" + statusBars + "]";
	}
	
}
