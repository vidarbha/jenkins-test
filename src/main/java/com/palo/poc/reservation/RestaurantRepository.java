package com.palo.poc.reservation;

import org.springframework.data.repository.CrudRepository;


public interface RestaurantRepository extends CrudRepository<RestaurantTable, Long> {
}
