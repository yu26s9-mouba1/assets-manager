package com.pluralsight;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("My house", "01/15/2020", 250000,
                "123 Main Street", 2, 1800, 5000));

        myAssets.add(new House("Vacation home", "06/10/2022", 180000,
                "45 Beach Road", 1, 1200, 3000));

        myAssets.add(new Vehicle("Tom's truck", "03/20/2021", 35000,
                "Ford F-150", 2021, 85000));

        myAssets.add(new Vehicle("My car", "08/05/2018", 28000,
                "Toyota Camry", 2018, 120000));

        for (Asset asset : myAssets) {
            String message = "";

            if (asset instanceof House) {
                House house = (House) asset;
                message = "House at " + house.getAddress();
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());
            System.out.println(message);
            System.out.println("--------------------------------");
        }
    }

    }









