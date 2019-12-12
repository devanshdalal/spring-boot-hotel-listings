package com.hotel.listings.model;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HotelListingRepository extends PagingAndSortingRepository<HotelListing, String> {

    Page<HotelListing> findByNameRegex(String name, Pageable pageable);
    Page<HotelListing> findByNeighbourhoodAndNameRegex(
            String neighbourhood,
            String nameRegexp,
            Pageable pageable);
}


