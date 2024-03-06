package com.ship.spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ship.spring.dto.BoardDTO;
import com.ship.spring.dto.ReservationDTO;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<BoardDTO> getBoardList(BoardDTO boardDTO) {
		return sqlSession.selectList("board.getBoardList", boardDTO);
	}
}
