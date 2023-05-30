package com.peenoise.resortschedulingsystem.controller;

import com.peenoise.resortschedulingsystem.model.Users;
import com.peenoise.resortschedulingsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<Users>> getAllUsers() {
        return new ResponseEntity<>(usersService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Users> addUser(@RequestBody Users users) {
        return new ResponseEntity<>(usersService.addUser(users), HttpStatus.CREATED);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody Users users) {
        usersService.saveOrUpdate(users);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
    }
}
