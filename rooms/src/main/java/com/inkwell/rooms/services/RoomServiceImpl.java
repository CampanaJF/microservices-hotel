package com.inkwell.rooms.services;

import com.inkwell.rooms.model.Room;
import com.inkwell.rooms.repository.RoomJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

	private RoomJpaRepository roomJpaRepository;

	@Override
	public List<Room> search() {

		return roomJpaRepository.findAll();
	}

	@Override
	public List<Room> searchByHotelId(long hotelId) {
		return roomJpaRepository.findByHotelId(hotelId);
	}

}
