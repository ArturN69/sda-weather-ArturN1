package com.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApplication {

    public static void main(String[] args) {
        // create a new LocationController and pass it to the UserInterface by a constructor
        // todo create a new LocationService

        ObjectMapper objectMapper = new ObjectMapper();
        LocationController locationController = new LocationController(objectMapper); // todo inject LocationService
        UserInterface userInterface = new UserInterface(locationController);
        userInterface.run();
    }
}
