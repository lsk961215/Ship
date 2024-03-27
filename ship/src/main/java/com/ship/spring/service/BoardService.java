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
	
	public BoardDTO regBoard(BoardDTO boardDTO) {
		int result = boardDAO.regBoard(boardDTO);
		if(result == 1) {
			boardDTO.setMessage("등록되었습니다.");
			boardDTO.setState("1");
		} else {
			boardDTO.setMessage("등록에 실패하였습니다.");
			boardDTO.setState("0");
		}
		return boardDTO;
	}
	
	public BoardDTO checkPwd(BoardDTO boardDTO) {
		return boardDAO.checkPwd(boardDTO);
	}
	
	public BoardDTO deleteBoard(BoardDTO boardDTO) {
		int result = boardDAO.deleteBoard(boardDTO);
		if(result == 1) {
			boardDTO.setMessage("삭제되었습니다.");
			boardDTO.setState("1");
		} else {
			boardDTO.setMessage("비밀번호가 일치하지 않습니다.");
			boardDTO.setState("0");
		}
		return boardDTO;
	}
}
