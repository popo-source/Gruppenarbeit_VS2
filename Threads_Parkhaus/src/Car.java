public class Car extends Thread {

    private int number;
    private String brand;
    private String[] branding = {"audi a4", "porsche cayenne", "volkswagen golf", "fiat 500", "peugeot 206", "toyota yaris"};
    private ParkingGarage garage;


    public Car(int number, ParkingGarage garage){
        this.number = number;
        this.brand = branding[(int)(Math.random()*branding.length)];
        this.garage = garage;
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
            garage.enter(this);
            try {
                Thread.sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            garage.leave(this);
        }
    }

}