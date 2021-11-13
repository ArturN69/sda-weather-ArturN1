package com.sda.weather;

import java.util.Scanner;

public class UserInterface {
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
                    addNewPlace();
                    break;
                case 2:
                    showAllPlaces();
                    break;
                case 3:
                    showWeather();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void addNewPlace() {

    }

    private void showAllPlaces() {

    }

    private void showWeather() {

    }
}
