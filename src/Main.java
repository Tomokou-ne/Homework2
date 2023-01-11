import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

import java.util.*;


public class Main {

    public static void main(String[] args)  {

        Car lada = new Car("Lada", "Grande", 1.7, Car.Carcase.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.Carcase.HATCHBACK);
        Car bmv = new Car("BMV", "Z8",3.0, Car.Carcase.PICKUP);
        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, Car.Carcase.CROSSOVER);

        Truck zilBull = new Truck("ЗИЛ", "Бычок", 25, Truck.LiftingCapacity.N2);
        Truck eurotent = new Truck("Евротент", "", 25, Truck.LiftingCapacity.N1);
        Truck gazel = new Truck("Газель", "", 20, Truck.LiftingCapacity.N3);
        Truck zil = new Truck("ЗИЛ", "", 20, Truck.LiftingCapacity.N1);

        Bus uno = new Bus("MAN", "Lion's City", 25, Bus.SeatCapacity.SMALL);
        Bus duo = new Bus("VolgaBus", "5270GH", 30, Bus.SeatCapacity.BIG);
        Bus tres = new Bus("ЛИАЗ", "6231", 25, null);
        Bus quatro = new Bus("УАЗ", "Буханка", 35, Bus.SeatCapacity.AVERAGE);

        DriverB b = new DriverB("Иванов Иван Иванович", 5, lada);
        DriverC c = new DriverC("Колосков Дмитрий Попович", 8, gazel);
        DriverD d = new DriverD("Малицкий Николай Степанович", 4, duo);

        ArrayList<String> list = new ArrayList<>();
        list.add(lada.getBrand());
        list.add(audi.getBrand());
        list.add(bmv.getBrand());
        list.add(kia.getBrand());
        list.add(zilBull.getBrand());
        list.add(eurotent.getBrand());
        list.add(gazel.getBrand());
        list.add(zil.getBrand());
        list.add(uno.getBrand());
        list.add(duo.getBrand());
        list.add(tres.getBrand());
        list.add(quatro.getBrand());
        System.out.println(list);

        ArrayList<String> driver = new ArrayList<>();
        driver.add(b.getInitials());
        driver.add(c.getInitials());
        driver.add(d.getInitials());
        System.out.println(driver);

    }
}