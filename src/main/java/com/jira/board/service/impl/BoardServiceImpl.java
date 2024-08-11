package com.jira.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jira.board.dto.BoardDto;
import com.jira.board.models.Board;
import com.jira.board.repository.BoardRepo;
import com.jira.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepo boardRepo;
	
	@Override
	public Board createBoard(Board board) {
		return boardRepo.save(board);		
	}
	
	@Override
	public List<Board> getAllBoard() {		
		return boardRepo.findAll();
	}

	@Override
	public Board getBoardById(String boardId) {
		return boardRepo.getReferenceById(boardId);
	}

}
