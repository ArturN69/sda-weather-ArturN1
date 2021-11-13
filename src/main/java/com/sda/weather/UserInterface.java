package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    // todo private final LocationController locationController
    private final LocationController locationController;

    // todo update a constructor and obtain a locationController
    public UserInterface(LocationController locationController) {
        this.locationController = locationController;
    }

    public void run() {
        System.out.println("Aplikacja pogodowa jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Witaj w aplikacji serwisu pogodowego. Wybierz jedną z opcji poniżej?");
            System.out.println("1. Dodaj lokalizację");
            System.out.println("2. Wyświetl dodane lokalizacje");
            System.out.println("3. Wyświetl pogodę dla wybranej lokalizacji");
            System.out.println("0. Zamknij aplikację");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addNewLocation();
                    break;
                case 2:
                    showAllLocations();
                    break;
                case 3:
                    showWeather();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void addNewLocation() {
        // todo use a Scanner class
        // todo get location data
        // todo create a JSON based on those data -> JSON has a String type
        // todo use locationController and pass the JSON
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta:");
        String city = scanner.nextLine();
        System.out.println("Podaj nazwę kraju:");
        String country = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną:");
        String latitude = scanner.nextLine();
        System.out.println("Podaj długość geograficzną:");
        String longitude = scanner.nextLine();
        String requestData = String.format("{\"city\": \"%s\",\"country\": \"%s\",\"latitude\": \"%s\", \"longitude\": \"%s\"}", city, country, latitude, longitude);

        String response = locationController.addNewLocation(requestData);
        System.out.println("Server response: " + response);

    }

    private void showAllLocations() {

    }

    private void showWeather() {

    }
}
