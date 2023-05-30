package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Users;
import com.peenoise.resortschedulingsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users addUser(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public void saveOrUpdate(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}
