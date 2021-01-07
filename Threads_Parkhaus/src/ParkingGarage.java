import java.util.ArrayList;
import java.util.List;

public class ParkingGarage {

    long parkplace;
    List<Car> parked = new ArrayList<Car>();

    public void enter(Car car){
        if(parked.size()<=parkplace){
            parked.add(car);
            System.out.println("Auto "+car.getNumber()+": eingefahren");
        }
    }

    public void leave(Car car){
        if(parked.contains(car)) {
            parked.remove(car);
            System.out.println("Auto " + car.getNumber() + ": ausgefahren");
        }
    }



}
