package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import com.globomatics.bike.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeService bikeService;

    @GetMapping
    public Iterable<Bike> list(){
        return bikeService.getBikes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Bike bike){
        bikeService.createBike(bike);
    }

    @GetMapping("/{id}")
    public Optional<Bike> get(@PathVariable("id") long id){
        return bikeService.getBike(id);
    }
}
