package com.hotel.listings.model;

//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// name,host_name,neighbourhood_group,neighbourhood,
// latitude,longitude,room_type,price
@Document(collection="HotelListing")
public class HotelListing {

    private String name;
    private String host_name;
    private String neighbourhood_group;
    private String neighbourhood;
    private float latitude;
    private float longitude;
    private String room_type;
    private int price;

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(final String host_name) {
        this.host_name = host_name;
    }

    public String getNeighbourhood_group() {
        return neighbourhood_group;
    }

    public void setNeighbourhood_group(final String neighbourhood_group) {
        this.neighbourhood_group = neighbourhood_group;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(final String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(final float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(final float longitude) {
        this.longitude = longitude;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(final String room_type) {
        this.room_type = room_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

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