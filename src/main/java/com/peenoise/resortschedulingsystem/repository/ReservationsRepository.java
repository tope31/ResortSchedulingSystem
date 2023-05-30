package com.peenoise.resortschedulingsystem.repository;

import com.peenoise.resortschedulingsystem.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Long> {
}
