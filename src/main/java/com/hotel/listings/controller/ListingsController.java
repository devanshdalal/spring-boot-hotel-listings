package com.hotel.listings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.listings.model.HotelListing;

@RestController
public class ListingsController {

    private static final String template = "Hello, %s!";

    @Autowired
    private HotelListing listing;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        System.out.println("Here");
        listing.setName(template);
        return listing.toString();
    }
}