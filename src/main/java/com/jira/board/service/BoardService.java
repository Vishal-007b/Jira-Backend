package com.jira.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jira.board.dto.BoardDto;
import com.jira.board.models.Board;

@Service
public interface BoardService {

	public Board createBoard(Board board);

	public List<Board> getAllBoard();
	
	public Board getBoardById(String boardId);
	
}
