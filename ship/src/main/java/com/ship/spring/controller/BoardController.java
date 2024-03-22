package com.ship.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ship.spring.dto.BoardDTO;
import com.ship.spring.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/getBoardList")
	public List getBoardList(@RequestBody BoardDTO boardDTO) {
		return boardService.getBoardList(boardDTO);
	}
	
	@RequestMapping("/getBoardDetail")
	public BoardDTO getBoardDetail(@RequestBody BoardDTO boardDTO) {
		return boardService.getBoardDetail(boardDTO);
	}
	
	@PostMapping("/regBoard")
	public BoardDTO regBoard(@RequestBody BoardDTO boardDTO) {
		return boardService.regBoard(boardDTO);
	}
}
