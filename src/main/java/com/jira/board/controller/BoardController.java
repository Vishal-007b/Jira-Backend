package com.jira.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jira.board.dto.BoardDto;
import com.jira.board.models.Board;
import com.jira.board.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getAllBoards")
	public List<Board> getAllBoard() {
		return boardService.getAllBoard();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/create")
	public Board createBoard(@RequestBody BoardDto boardDto) {
		System.out.println(boardDto);		
		return boardService.createBoard(new Board(boardDto.getId(), boardDto.getName(), boardDto.getStausBars()));
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getBoard/{boardId}")
	public BoardDto getBoardById(@PathVariable(required=true) String boardId) {
		System.out.println(boardId);		
		Board board =  boardService.getBoardById(boardId);
		System.out.println("Board found " + board);
		return new BoardDto(board.getId(), board.getName(), board.getBars());
	}
	
	
}
