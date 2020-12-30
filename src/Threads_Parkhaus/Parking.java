package Threads_Parkhaus;

import java.util.Scanner;

public class Parking {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ParkingGarage garage = new ParkingGarage();
        System.out.println("Wirkommen in unseren Parkhaus");

        //Optionale eingabe:

        /*
        System.out.print("Wählen sie eine anzahl von parkplätze:");
        garage.parkplace=input();
        System.out.print("Wählen sie eine anzahl von Autos:");
        int autos = input();
        */

        garage.parkplace = 10;
        int autos = 10;
        Car[] cars = new Car[autos];

        for(int i=0;i<autos;i++){
            cars[i] = new Car(i+1, garage);
            cars[i].start();
        }

    }

    public static int input(){
        int input = 0;
        boolean valid = false;
        do{
            input = (int) TastaturRead.readLong();
            if(input<=0){
                System.out.println("!!! Eingabe nicht möglich !!!");
                System.out.print("Geben sie nochmal ein zahl ein:");
            } else {
                valid = true;
            }
        }while(valid==false);
        return input;
    }

}
