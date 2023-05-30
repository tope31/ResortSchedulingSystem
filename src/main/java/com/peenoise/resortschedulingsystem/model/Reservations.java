package com.peenoise.resortschedulingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", nullable = false)
    private Long reservationId;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "resort_id", nullable = false)
    private Long resortId;
    @Column(name = "start_date", nullable = false)
    private String startDate;
    @Column(name = "end_date", nullable = false)
    private String endDate;
    @Column(name = "status", nullable = false)
    private String status;


}
