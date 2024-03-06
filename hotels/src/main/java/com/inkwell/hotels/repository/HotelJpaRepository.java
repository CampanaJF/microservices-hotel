package com.inkwell.hotels.repository;

import com.inkwell.hotels.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelJpaRepository extends JpaRepository<Hotel, Long> {

}
