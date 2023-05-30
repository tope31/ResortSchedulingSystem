package com.peenoise.resortschedulingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "resorts")
public class Resorts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resort_id", nullable = false)
    private Long resortId;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "image_url")
    public String imageUrl;
    @Column(name = "owner_id")
    public Long ownerId;
    @Column(name = "status")
    public String status;
    @Column(name = "price")
    public Integer price;
}
