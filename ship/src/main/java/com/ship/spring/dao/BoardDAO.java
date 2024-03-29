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
	
	public BoardDTO getBoardDetail(BoardDTO boardDTO) {
		return sqlSession.selectOne("board.getBoardDetail", boardDTO);
	}
	
	public int regBoard(BoardDTO boardDTO) {
		return sqlSession.insert("board.regBoard", boardDTO);
	}
	
	public BoardDTO checkPwd(BoardDTO boardDTO) {
		return sqlSession.selectOne("board.checkPwd", boardDTO);
	}
	
	public int deleteBoard(BoardDTO boardDTO) {
		return sqlSession.delete("board.deleteBoard", boardDTO);
	}
}
