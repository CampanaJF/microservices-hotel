package com.inkwell.rooms.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.inkwell.rooms.config.RoomsServiceConfiguration;
import com.inkwell.rooms.model.Room;
import com.inkwell.rooms.model.RoomProperties;
import com.inkwell.rooms.services.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("rooms")
public class RoomController {

	private RoomService service;

	private RoomsServiceConfiguration config;
	
	@GetMapping
	public List<Room> search(){
		return this.service.search();
	}

	@GetMapping("/{hotelId}")
	public List<Room> searchByHotelId(@PathVariable("hotelId") long hotelId){
		return this.service.searchByHotelId(hotelId);
	}

	@GetMapping("/read/properties")
	public String properties() throws JsonProcessingException {
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		RoomProperties roomProperties = new RoomProperties(config.getMsg(),
				config.getBuildVersion(), config.getMailDetails());
		return objectWriter.writeValueAsString(roomProperties);
	}
}
