package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Reservations;
import com.peenoise.resortschedulingsystem.model.Users;
import com.peenoise.resortschedulingsystem.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationsServiceImpl implements ReservationsService {
    @Autowired
    private ReservationsRepository reservationsRepository;
    @Override
    public List<Reservations> getAllReservations() {
        return reservationsRepository.findAll();
    }

    @Override
    public Reservations addReservation(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public void saveOrUpdate(Reservations reservations) {
        reservationsRepository.save(reservations);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationsRepository.deleteById(id);
    }
}
