package com.sda.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// import javax.xml.stream.Location; // todo remove this import
//                                       you have to create your own Location class and use it here

public class LocationController {

    private final ObjectMapper objectMapper;
    private final LocationService locationService;

    public LocationController(ObjectMapper objectMapper, LocationService locationService) {
        this.objectMapper = objectMapper;
        this.locationService = locationService;
        // inject LocationService
    }

    public String addNewLocation(String data) { // a data is a JSON format
        // deserialize data (as a JSON) to a LocationDTO -> use ObjectMapper
        // todo pass those data to eg. LocationService as single values (avoid passing DTOs to a service layer)
        try {
            LocationDTO locationDTO = objectMapper.readValue(data, LocationDTO.class);
            String city = locationDTO.getCity();
            String region = locationDTO.getRegion();
            String country = locationDTO.getCountry();
            String latitude = locationDTO.getLatitude();
            String longitude = locationDTO.getLongitude();

            // todo use LocationService and pass those data

            // todo create a new Location object inside a LocationService
            //  Location newLocation = locationService.createLocation(city, region...) <---------------------------
            Location newLocation = locationService.createLocation(city, region, country, latitude, longitude);
            // todo serialize (Location) newLocation to JSON by using objectMapper.writeValueAsString(...)

            return objectMapper.writeValueAsString(newLocation);
            // todo return ....
        } catch (JsonProcessingException e) { // todo catch IllegalArgumentException as well
            String errorMessage = e.getMessage();
            return "{\"message\": \"" + errorMessage + "\"}";
        }

        // return data; // todo remove it
    }
}
