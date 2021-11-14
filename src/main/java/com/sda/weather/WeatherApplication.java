package com.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApplication {
    public static void main(String[] args) {
        // create a new LocationController and pass it to the UserInterface by a constructor
        ObjectMapper objectMapper = new ObjectMapper();
        LocationController locationController = new LocationController(objectMapper);
        UserInterface userInterface = new UserInterface(locationController);
        userInterface.run();
    }
}
