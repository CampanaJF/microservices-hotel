package com.inkwell.rooms.repository;

import com.inkwell.rooms.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomJpaRepository extends JpaRepository<Room, Long> {

    public List<Room> findByHotelId(long hotelId);
}
