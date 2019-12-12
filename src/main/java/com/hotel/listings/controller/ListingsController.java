package com.hotel.listings.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.listings.model.HotelListing;
import com.hotel.listings.model.HotelListingRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ListingsController {

    private HotelListingRepository repository;


    ListingsController(HotelListingRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<HotelListing> list(
            @RequestParam(name="name", defaultValue="") String name,
            @RequestParam(name="start", defaultValue="0") int pageIndex,
            @RequestParam(name="limit", defaultValue="20") int pageSize,
            @RequestParam(name="sort", defaultValue = "") String sortBy,
            @RequestParam(name="region", defaultValue = "") String region) {
        System.out.println("name " + name);
        System.out.println("pageIndex " + pageIndex);
        System.out.println("pageSize " + pageSize);
        System.out.println("sort " + sortBy);
        System.out.println("region " + region);
        Pageable pageable = null;
        if (sortBy.isEmpty()) {
            pageable = PageRequest.of(pageIndex, pageSize);
        } else {
            String[] order = sortBy.split(",");
            pageable = PageRequest.of(pageIndex, pageSize,
                    Sort.by(Sort.Direction.fromString(order[1]), order[0]));
        }
        Page<HotelListing> page = null;
        if (name.isEmpty() && region.isEmpty()) {
            page = repository.findAll(pageable);
            System.out.println("page.getTotalElements() " + page.getTotalElements());
            return page.getContent();
        } else {
            return region.isEmpty() ?
                    repository.findByNameRegex(name, pageable):
                    repository.findByNeighbourhoodAndNameRegex(region, name,
                    pageable);
        }
    }
}