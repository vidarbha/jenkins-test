package com.palo.poc.reservation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RestaurantTable {

    @Id
    private Long id;
    private String status;


    protected RestaurantTable() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
