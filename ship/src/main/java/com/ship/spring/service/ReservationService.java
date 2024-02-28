package com.ship.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.spring.dao.ReservationDAO;
import com.ship.spring.dto.BoardDTO;
import com.ship.spring.dto.ReservationDTO;

@Service
public class ReservationService {
	
	@Autowired
	ReservationDAO reservationDAO;
	
	public List<ReservationDTO> getReservationList(ReservationDTO reservationDTO) {
		return reservationDAO.getReservationList(reservationDTO);
	}
	
	public int book(List<ReservationDTO> reservationDTOList) {
		for(int i = 0; i<reservationDTOList.size(); i++) {
			String usrNo = Integer.toString(reservationDAO.regUser(reservationDTOList.get(i)));
			reservationDTOList.get(i).setUsr_no(usrNo);
		}
		
		reservationDAO.book(reservationDTOList);
		
		return 0;
	}
}
