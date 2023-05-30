package com.peenoise.resortschedulingsystem.service;


import com.peenoise.resortschedulingsystem.model.Resorts;

import java.util.List;

public interface ResortsService {
    List<Resorts> getAllResorts();

    Resorts addResort(Resorts resorts);

    void saveOrUpdate(Resorts resorts);

    void deleteResort(Long id);


}
