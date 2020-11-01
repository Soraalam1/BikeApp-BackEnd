package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BikeService {
    @Autowired
    BikeRepository bikeRepository;


    public Iterable<Bike> getBikes(){
        return bikeRepository.findAll();
    }

    public void createBike(Bike bike){
        bikeRepository.save(bike);
    }

    public Optional<Bike> getBike(Long id){
        return bikeRepository.findById(id);
    }
}
