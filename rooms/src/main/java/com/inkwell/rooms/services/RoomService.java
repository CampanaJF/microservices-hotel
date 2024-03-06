package com.inkwell.rooms.services;

import com.inkwell.rooms.model.Room;

import java.util.List;

public interface RoomService {
	
	List<Room> search();

	List<Room> searchByHotelId(long hotelId);

}
