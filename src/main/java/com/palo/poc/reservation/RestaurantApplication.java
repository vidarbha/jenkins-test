package com.palo.poc.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantApplication {


    @Autowired
    RestaurantRepository restaurantRepository;

    @RequestMapping("/restaurant")
    private String testOK(){
            return "Test OK!";
        }

    @RequestMapping("/restaurant/table")
    private List<RestaurantTable> getAllTables(){
        return (List<RestaurantTable>) restaurantRepository.findAll();
    }

    @RequestMapping("/restaurant/table/{tableNumber}")
    private RestaurantTable getTable(@PathVariable Long tableNumber){
        return  restaurantRepository.findById(tableNumber).get();
    }
}
