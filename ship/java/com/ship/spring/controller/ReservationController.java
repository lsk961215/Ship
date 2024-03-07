package com.ship.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ship.spring.dto.ReservationDTO;
import com.ship.spring.service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/getReservationList")
	public List getReservationList(@RequestBody ReservationDTO reservationDTO) {
		return reservationService.getReservationList(reservationDTO);
	}
	
	@RequestMapping("/book")
	public ReservationDTO book(@RequestBody List<ReservationDTO> reservationDTOList) {
		ReservationDTO reservationDTO = new ReservationDTO();
		try {
			reservationDTO = reservationService.book(reservationDTOList);
			return reservationDTO;
		} catch (IndexOutOfBoundsException e) {
			reservationDTO.setMessage("예약과정에서 문제가 발생했습니다.");
			return reservationDTO;
		}
	}
}
