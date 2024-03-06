package com.inkwell.hotels.services;

import com.inkwell.hotels.model.Hotel;
import com.inkwell.hotels.model.HotelRooms;
import com.inkwell.hotels.model.Room;
import com.inkwell.hotels.repository.HotelJpaRepository;
import com.inkwell.hotels.services.client.RoomsFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

	private final HotelJpaRepository hotelJpaRepository;

	private final RoomsFeignClient roomsClient;

	@Override
	public List<Hotel> search() {
		return hotelJpaRepository.findAll();
	}

	@Override
	public HotelRooms searchHotelById(long hotelId) {

		Hotel hotel = hotelJpaRepository.findById(hotelId).orElse(null);

		if(hotel == null) return null;

		List<Room> rooms = roomsClient.searchByHotelId(hotelId);

		return HotelRooms.builder()
				.hotelId(hotelId)
				.hotelAddress(hotel.getAddress())
				.hotelName(hotel.getName())
				.rooms(rooms)
				.build();
	}
}
