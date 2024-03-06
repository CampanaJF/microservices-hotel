package com.inkwell.hotels.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.inkwell.hotels.config.HotelsServiceConfiguration;
import com.inkwell.hotels.model.Hotel;
import com.inkwell.hotels.model.HotelProperties;
import com.inkwell.hotels.model.HotelRooms;
import com.inkwell.hotels.services.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("hotels")
public class HotelController {

	private HotelService hotelService;

	private HotelsServiceConfiguration config;

	@GetMapping
	public List<Hotel> search(){
		return this.hotelService.search();
	}

	@GetMapping("/{hotelId}")
	public HotelRooms searchById(@PathVariable("hotelId") long hotelId){
		return hotelService.searchHotelById(hotelId);
	}

	@GetMapping("/read/properties")
	public String properties() throws JsonProcessingException {
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		HotelProperties hotelProperties = new HotelProperties(config.getMsg(),
				config.getBuildVersion(), config.getMailDetails());
		return objectWriter.writeValueAsString(hotelProperties);
	}

}
