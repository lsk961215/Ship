package com.ship.spring.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ship.spring.dto.ReservationDTO;

@Repository
public class ReservationDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<ReservationDTO> getReservationList(ReservationDTO reservationDTO) {
		return sqlSession.selectList("reservation.getReservationList", reservationDTO);
	}
	
	public int regUser(ReservationDTO reservationDTO) {
		int usrNo = sqlSession.selectOne("reservation.regUser", reservationDTO);
		return usrNo;
	}
	
	public String book(List<ReservationDTO> reservationDTOList) {
		List<String> rsvDt = sqlSession.selectList("reservation.book", reservationDTOList);
		return rsvDt.get(0);
	}
}
