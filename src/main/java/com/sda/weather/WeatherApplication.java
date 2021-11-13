package com.sda.weather;

public class WeatherApplication {
    public static void main(String[] args) {
        // todo create a new LocationController and pass it to the UserInterface by a constructor
        UserInterface userInterface = new UserInterface();
        userInterface.run();
    }
}
