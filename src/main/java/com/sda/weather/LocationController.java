package com.sda.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationController {

    private final ObjectMapper objectMapper;

    public LocationController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
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

            locationDTO entry
            LocationDTO locationDTO1 = new LocationDTO();


        } catch (JsonProcessingException e) {
            String errorMessage = e.getMessage();
            return "{\"message\": \"" + errorMessage + "\"}";
        }

        return data;
    }
}
