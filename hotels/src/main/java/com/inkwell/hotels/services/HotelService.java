package com.inkwell.hotels.services;

import com.inkwell.hotels.model.Hotel;
import com.inkwell.hotels.model.HotelRooms;

import java.util.List;

public interface HotelService {
	
	List<Hotel> search();
	HotelRooms searchHotelById(long hotelId);

}
