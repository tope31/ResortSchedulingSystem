package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Images;
import com.peenoise.resortschedulingsystem.repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImagesServiceImpl implements ImagesService {
    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public List<Images> getAllImages() {
        return imagesRepository.findAll();
    }

    @Override
    public Images addImage(Images images) {
        return imagesRepository.save(images);
    }

    @Override
    public void saveOrUpdate(Images images) {
        imagesRepository.save(images);
    }

    @Override
    public void deleteImage(Long id) {
        imagesRepository.deleteById(id);
    }
}
