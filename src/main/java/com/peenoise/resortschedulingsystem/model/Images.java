package com.peenoise.resortschedulingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", nullable = false)
    private Long imageId;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image_data", nullable = false)
    private String imageData;

}
