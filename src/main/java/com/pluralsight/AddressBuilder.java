package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        address.append(fullName).append("\n\n");

        addAddress(scanner, address, "Billing");

        address.append("\n");

        addAddress(scanner, address, "Shipping");

        System.out.println();
        System.out.print(address);
    }

    public static void addAddress(Scanner scanner, StringBuilder address, String type) {
        System.out.print(type + " Street: ");
        String street = scanner.nextLine();

        System.out.print(type + " City: ");
        String city = scanner.nextLine();

        System.out.print(type + " State: ");
        String state = scanner.nextLine();

        System.out.print(type + " Zip: ");
        String zip = scanner.nextLine();

        address.append(type).append(" Address:\n");
        address.append(street).append("\n");
        address.append(city).append(", ").append(state).append(" ").append(zip).append("\n");
    }
}