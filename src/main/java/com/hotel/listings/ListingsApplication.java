package com.hotel.listings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotel.listings.model.HotelListing;
import com.hotel.listings.model.HotelListingRepository;

@SpringBootApplication
public class ListingsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ListingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
