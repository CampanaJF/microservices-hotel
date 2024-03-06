package com.inkwell.reservations.dao;

import com.inkwell.reservations.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationJpaRepository extends JpaRepository<Reservation, Long> {

}
