package it.DevelHope.Exercise11;

import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please insert the address: ");
        house.address = (scanner.nextLine());

        System.out.println("Please insert the floors number: ");
        house.floorsNumber = (scanner.nextInt());

        System.out.println("Please insert the resident names: ");
        house.residentNames = (scanner.next().split(","));

        System.out.println(String.format("This house has %d floors", house.getFloorsNumber()));
        System.out.println(String.format("The address of this house is %s", house.getAddress()));
        System.out.println(String.format("The name of the residents are %s ", Arrays.toString(house.getResidentNames())));



    }
}
