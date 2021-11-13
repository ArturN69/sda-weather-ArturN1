package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    // todo private final LocationController locationController
    // todo update a constructor and obtain a locationController

    public void run() {
        System.out.println("Aplikacja pogodowa jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Witaj w aplikacji serwisu pogodowego. Wybierz jedną z opcji poniżej?");
            System.out.println("1.Dodaj lokalizację");
            System.out.println("2.Wyświetl dodane lokalizacje");
            System.out.println("3.Wyświetl pogodę dla wybranej lokalizacji");
            System.out.println("0.Zamknij aplikację");

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
    }

    private void showAllLocations() {

    }

    private void showWeather() {

    }
}
