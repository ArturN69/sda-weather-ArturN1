package com.sda.weather;

import javax.xml.stream.Location;

public class LocationService {

    int parsedLatitude; // todo move it to the method createLocation
    int parsedLongitude; // todo move it to the method createLocation

    // todo create a new method
    //  Location createLocation(String city, String country...)

    public Location createLocation(String city, String region, String country, String latitude, String longitude) {
        parsedLatitude = Integer.parseInt(latitude); // todo this parseInt method may throw NumberFormatException, you have to handle it
        parsedLongitude = Integer.parseInt(longitude);

        /**

        try{
          ...
          Integer.parseInt(longitude)
          ...
        } catch (NumberFormatException e) {
          throw new IllegalArgumentException("message");
        }

        */

        if (city == null || country == null || city.isEmpty() || country.isEmpty()) {
            throw new IllegalArgumentException("Wprowadzone dane: miasto i kraj nie mogą być puste");
        }

        // todo use parsedLatitude and parsedLongitude (int type)
        if (latitude >= 90 || latitude <= -90 || longitude >= 180 || longitude <= -180) {
            throw new IllegalArgumentException("Wprowadzone parametry: długość i szerokość geograficzna znajdują się poza dopuszczalnym zakresem");
        };

        // todo create a new location object based on new Location class and provide those data
        // todo pass this location object to locationRepository.save(...) to store this data in a database
        // todo returns location object
        return null;
    }
}
