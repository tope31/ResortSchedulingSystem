package com.peenoise.resortschedulingsystem.service;

import com.peenoise.resortschedulingsystem.model.Resorts;
import com.peenoise.resortschedulingsystem.repository.ResortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortsServiceImpl implements ResortsService {
    @Autowired
    private ResortsRepository resortsRepository;

    @Override
    public List<Resorts> getAllResorts() {
        return resortsRepository.findAll();
    }

    @Override
    public Resorts addResort(Resorts resorts) {
        return resortsRepository.save(resorts);
    }

    @Override
    public void saveOrUpdate(Resorts resorts) {
        resortsRepository.save(resorts);
    }

//    @Override
//    public String updateResort(Resorts resorts) {

//        if (resortsRepository.existsById(resorts.getId())) {
//            resorts.setId(resorts.getId());
//            resortsRepository.save(resorts);
//            return "Successfully updated";
//        } else {
//            return "There is no id like this";
//        }
//    }

    @Override
    public void deleteResort(Long id) {
        resortsRepository.deleteById(id);
    }
}
