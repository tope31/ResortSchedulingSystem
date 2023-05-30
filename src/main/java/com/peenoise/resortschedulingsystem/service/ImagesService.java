package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Images;
import com.peenoise.resortschedulingsystem.model.Resorts;

import java.util.List;

public interface ImagesService {

    List<Images> getAllImages();

    Images addImage(Images images);

    void saveOrUpdate(Images images);

    void deleteImage(Long id);
}
