package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Reservations;
import com.peenoise.resortschedulingsystem.model.Users;

import java.util.List;

public interface ReservationsService {
    List<Reservations> getAllReservations();

    Reservations addReservation(Reservations reservations);

    void saveOrUpdate(Reservations reservations);

    void deleteReservation(Long id);
}
