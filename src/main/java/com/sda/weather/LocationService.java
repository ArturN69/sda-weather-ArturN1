package com.sda.weather;

import javax.xml.stream.Location;

public class LocationService {

    int parsedLatitude;
    int parsedLongitude;

    // todo create a new method
    //  Location createLocation(String city, String country...)

    public Location createLocation(String city, String region, String country, String latitude, String longitude) {

        parsedLatitude = Integer.parseInt(latitude);
        parsedLongitude = Integer.parseInt(longitude);

        if (city == null || country == null || city.isEmpty() || country.isEmpty()) {
            throw new IllegalArgumentException("Wprowadzone dane: miasto i kraj nie mogą być puste");
        }
        if (latitude >= 90 || latitude <= -90 || longitude >= 180 || longitude <= -180) {
            throw new IllegalArgumentException("Wprowadzone parametry: długość i szerokość geograficzna znajdują się poza dopuszczalnym zakresem");
        };
    }
}
