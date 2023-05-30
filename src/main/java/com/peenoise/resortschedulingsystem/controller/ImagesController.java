package com.peenoise.resortschedulingsystem.controller;

import com.peenoise.resortschedulingsystem.model.Images;
import com.peenoise.resortschedulingsystem.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
public class ImagesController {
    @Autowired
    private ImagesService imagesService;

    @GetMapping("/getAllImages")
    public ResponseEntity<List<Images>> getAllImages() {
        return new ResponseEntity<>(imagesService.getAllImages(), HttpStatus.OK);
    }

    @PostMapping("/addImage")
    public ResponseEntity<Images> addImage(@RequestBody Images images) {
        return new ResponseEntity<>(imagesService.addImage(images), HttpStatus.CREATED);
    }

    @PutMapping("/updateImage")
    public void updateResort(@RequestBody Images images) {
        imagesService.saveOrUpdate(images);
    }

    @DeleteMapping("/deleteImage/{id}")
    public void deleteResort(@PathVariable Long id) {
        imagesService.deleteImage(id);
    }

}
