package com.humanCompilers.hotelTulip.dao;


import com.humanCompilers.hotelTulip.model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReservationRepository extends CrudRepository<Reservation, UUID> {

}