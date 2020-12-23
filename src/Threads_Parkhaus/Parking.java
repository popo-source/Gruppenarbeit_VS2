package Threads_Parkhaus;

import java.util.Scanner;

public class Parking {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to the new Parking,\n Choose a parking size (number of places):");
        ParkingGarage garage = new ParkingGarage();
        garage.parkplace=200;


        /*
        do{
            garage.parkplace = TastaturRead.readLong();
            if(garage.parkplace<=0){
                System.out.println("Fehler bei der eingabe!");
            }
        } while(garage.parkplace<=0);
        */





    }

}
