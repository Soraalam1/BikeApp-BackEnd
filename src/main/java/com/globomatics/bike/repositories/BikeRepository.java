package com.globomatics.bike.repositories;

import com.globomatics.bike.models.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository<Bike, Long> {

}
