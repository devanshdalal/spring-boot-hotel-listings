package com.hotel.listings.model;

//import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class HotelListing {

//    @Id
//    public String id;
    private String name;

//    public HotelListing(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("HotelListing[name='%s']", name);
    }

}