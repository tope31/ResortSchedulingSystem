package com.peenoise.resortschedulingsystem.repository;

import com.peenoise.resortschedulingsystem.model.Resorts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResortsRepository extends JpaRepository<Resorts, Long> {
}
