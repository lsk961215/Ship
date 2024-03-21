package com.ship.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.spring.Paging;
import com.ship.spring.dao.BoardDAO;
import com.ship.spring.dto.BoardDTO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	
	public List<BoardDTO> getBoardList(BoardDTO boardDTO) {
		Paging paging = new Paging(boardDTO.getPerPage(), boardDTO.getCurrPage());
		paging.setPaging();
		
		boardDTO.setMinRow(paging.getMinRow());
		boardDTO.setMaxRow(paging.getMaxRow());
		
		return boardDAO.getBoardList(boardDTO);
	}
	
	public BoardDTO getBoardDetail(BoardDTO boardDTO) {
		return boardDAO.getBoardDetail(boardDTO);
	}
}
