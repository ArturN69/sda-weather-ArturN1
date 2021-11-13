package com.sda.weather;

public class WeatherApplication {
    public static void main(String[] args) {
        // create a new LocationController and pass it to the UserInterface by a constructor
        LocationController locationController = new LocationController();
        UserInterface userInterface = new UserInterface(locationController);
        userInterface.run();
    }
}
