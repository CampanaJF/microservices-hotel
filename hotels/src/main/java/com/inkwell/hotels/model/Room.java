package com.inkwell.hotels.model;

import lombok.Data;

@Data
public class Room {

    private long id;

    private long hotelId;

    private String name;

    private Boolean available;
}
