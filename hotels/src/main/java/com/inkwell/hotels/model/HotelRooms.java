package com.inkwell.hotels.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class HotelRooms {

    private long hotelId;
    private String hotelName;
    private String hotelAddress;
    private List<Room> rooms;
}
