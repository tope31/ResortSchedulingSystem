package com.peenoise.resortschedulingsystem.controller;

import com.peenoise.resortschedulingsystem.model.Reservations;
import com.peenoise.resortschedulingsystem.model.Resorts;
import com.peenoise.resortschedulingsystem.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationsController {
    @Autowired
    private ReservationsService reservationsService;

    @GetMapping("/getAllReservations")
    public ResponseEntity<List<Reservations>> getAllReservations() {
        return new ResponseEntity<>(reservationsService.getAllReservations(), HttpStatus.OK);
    }

    @PostMapping("/addReservation")
    public ResponseEntity<Reservations> addReservation(@RequestBody Reservations reservations) {
        return new ResponseEntity<>(reservationsService.addReservation(reservations), HttpStatus.CREATED);
    }

    @PutMapping("/updateReservation")
    public void updateReservation(@RequestBody Reservations reservations) {
        reservationsService.saveOrUpdate(reservations);
    }

    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationsService.deleteReservation(id);
    }


}
