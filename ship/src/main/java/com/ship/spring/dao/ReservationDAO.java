package com.ship.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ship.spring.dto.ReservationDTO;

@Repository
public class ReservationDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public List getReservationList(ReservationDTO reservationDTO) {
		return sqlSession.selectList("reservation.getReservationList", reservationDTO);
	}
	
	public void book(ReservationDTO reservationDTO) {
		sqlSession.insert("reservation.book", reservationDTO);
	}
}
