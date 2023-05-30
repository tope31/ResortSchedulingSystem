package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Resorts;
import com.peenoise.resortschedulingsystem.model.Users;

import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();

    Users addUser(Users users);

    void saveOrUpdate(Users users);

    void deleteUser(Long id);
}
