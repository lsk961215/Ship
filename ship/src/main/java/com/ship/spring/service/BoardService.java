package com.ship.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.spring.dao.BoardDAO;
import com.ship.spring.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	
	public List<BoardDTO> getBoardList(BoardDTO boardDTO) {
		return boardDAO.getBoardList(boardDTO);
	}
}
