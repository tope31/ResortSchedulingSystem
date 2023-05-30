package com.peenoise.resortschedulingsystem.repository;

import com.peenoise.resortschedulingsystem.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Long> {
}
