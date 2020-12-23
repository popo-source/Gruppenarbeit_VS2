package Threads_Parkhaus;



import static java.lang.Thread.*;

public class Car extends Thread {

    private int number;
    private String brand;
    private String[] branding = {"audi a4", "porsche cayenne", "volkswagen golf", "fiat 500", "peugeot 206", "toyota yaris"};

    public Car(int number){
        this.number = number;
        this.brand = branding[(int)(Math.random()*branding.length)];
    }

    public int getNumber() {
        return number;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}