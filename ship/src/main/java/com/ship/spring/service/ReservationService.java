package com.ship.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.spring.dao.ReservationDAO;
import com.ship.spring.dto.ReservationDTO;

@Service
public class ReservationService {
	
	@Autowired
	ReservationDAO reservationDAO;
	
	public List getReservationList(ReservationDTO reservationDTO) {
		return reservationDAO.getReservationList(reservationDTO);
	}
	
	public int book(List<ReservationDTO> reservationDTOList) {
		List usrNoList = reservationDAO.regUser(reservationDTOList);
		reservationDAO.book(usrNoList);
		return 0;
	}
	
}
