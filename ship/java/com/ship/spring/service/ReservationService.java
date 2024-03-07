package com.ship.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Transactional(isolation = Isolation.SERIALIZABLE, rollbackFor = Exception.class)
	public ReservationDTO book(List<ReservationDTO> reservationDTOList) {
		for(int i = 0; i<reservationDTOList.size(); i++) {
			String usrNo = Integer.toString(reservationDAO.regUser(reservationDTOList.get(i)));
			reservationDTOList.get(i).setUsr_no(usrNo);
		}
		
		String rsvDt = reservationDAO.book(reservationDTOList);
		
		reservationDTOList.get(0).setRsvDt(rsvDt);
		reservationDTOList.get(0).setCustCnt(Integer.toString(reservationDTOList.size()));
		
		return reservationDTOList.get(0);
	}
}
