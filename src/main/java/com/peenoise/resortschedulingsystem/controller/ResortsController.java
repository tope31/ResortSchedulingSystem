package com.peenoise.resortschedulingsystem.controller;

import com.peenoise.resortschedulingsystem.model.Resorts;
import com.peenoise.resortschedulingsystem.service.ResortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resorts")
public class ResortsController {
    @Autowired
    private ResortsService resortsService;

    @GetMapping("/getAllResorts")
    public ResponseEntity<List<Resorts>> getAllResorts() {
        return new ResponseEntity<>(resortsService.getAllResorts(), HttpStatus.OK);
    }

    @PostMapping("/addResort")
    public ResponseEntity<Resorts> addResort(@RequestBody Resorts resorts) {
        return new ResponseEntity<>(resortsService.addResort(resorts), HttpStatus.CREATED);
    }

    @PutMapping("/updateResort")
    public void updateResort(@RequestBody Resorts resorts) {
       resortsService.saveOrUpdate(resorts);
    }

    @DeleteMapping("/deleteResort/{id}")
    public void deleteResort(@PathVariable Long id) {
        resortsService.deleteResort(id);
    }

}
