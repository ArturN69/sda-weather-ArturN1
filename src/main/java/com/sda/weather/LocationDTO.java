package com.sda.weather;

import lombok.Data;

// use @Data annotation from lombok
@Data
public class LocationDTO {

    private String city;
    private String region;
    private String country;
    private String latitude;
    private String longitude;
}
