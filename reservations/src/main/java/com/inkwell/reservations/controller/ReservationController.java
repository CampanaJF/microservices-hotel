package com.inkwell.reservations.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.inkwell.reservations.config.ReservationsServiceConfiguration;
import com.inkwell.reservations.model.Reservation;
import com.inkwell.reservations.model.ReservationProperties;
import com.inkwell.reservations.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservations")
public class ReservationController {

	private ReservationService reservationService;

	private ReservationsServiceConfiguration config;

	@GetMapping
	public List<Reservation> search(){

		return this.reservationService.search();
	}

	@GetMapping("/read/properties")
	public String properties() throws JsonProcessingException {
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		ReservationProperties reservationProperties = new ReservationProperties(config.getMsg(),
				config.getBuildVersion(), config.getMailDetails());
		return objectWriter.writeValueAsString(reservationProperties);
	}

}
