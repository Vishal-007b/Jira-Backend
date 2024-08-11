package com.jira.board.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Board")
public class Board {

	@Id
	private String id;
	
	private String name;

	@JsonProperty("statusBar")
	private String bars;

	public Board() {
		super();
	}

	public Board(String id, String name, String bars) {
		super();
		this.id = id;
		this.name = name;
		this.bars = bars;
	}

	public String getId() {
		return id;
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

	public String getBars() {
		return bars;
	}

	public void setBars(String bars) {
		this.bars = bars;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", name=" + name + ", bars=" + bars + "]";
	}
	
}
