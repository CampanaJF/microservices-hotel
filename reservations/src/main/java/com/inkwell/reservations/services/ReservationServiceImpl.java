package com.inkwell.reservations.services;

import com.inkwell.reservations.dao.ReservationJpaRepository;
import com.inkwell.reservations.model.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

	private ReservationJpaRepository reservationJpaRepository;
	
	@Override
	public List<Reservation> search() {

		return reservationJpaRepository.findAll();
	}

}
