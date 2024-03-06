package com.inkwell.hotels.services.client;

import com.inkwell.hotels.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("rooms")
public interface RoomsFeignClient {

    @RequestMapping(method = RequestMethod.GET,value = "rooms/{hotelId}", consumes = "application/json")
    List<Room> searchByHotelId(@PathVariable("hotelId") long hotelId);
}
