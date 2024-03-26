package com.ship.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ship.spring.dto.BoardDTO;
import com.ship.spring.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@PostMapping("/getBoardList")
	public List<BoardDTO> getBoardList(@RequestBody BoardDTO boardDTO) {
		return boardService.getBoardList(boardDTO);
	}
	
	@PostMapping("/getBoardDetail")
	public BoardDTO getBoardDetail(@RequestBody BoardDTO boardDTO) {
		return boardService.getBoardDetail(boardDTO);
	}
	
	@PostMapping("/regBoard")
	public BoardDTO regBoard(@RequestBody BoardDTO boardDTO) {
		return boardService.regBoard(boardDTO);
	}
	
	@PostMapping("/checkPwd")
	public BoardDTO checkPwd(@RequestBody BoardDTO boardDTO) {
		return boardService.checkPwd(boardDTO);
	}
	
	@PostMapping("/deleteBoard")
	public BoardDTO deleteBoard(@RequestBody BoardDTO boardDTO) {
		boardDTO = boardService.deleteBoard(boardDTO);
		return boardDTO;
	}
}
