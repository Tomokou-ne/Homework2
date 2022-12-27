import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;


public class Main {
    public static void main(String[] args)  {

        Car lada = new Car("Lada", "Grande", 1.7, Car.Carcase.SEDAN);
        //lada.transportWright();
        //lada.pitStop(9);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.Carcase.HATCHBACK);
        //audi.transportWright();
        //audi.bestCircleTime(180, 165, 174);
        Car bmv = new Car("BMV", "Z8",3.0, Car.Carcase.PICKUP);
        //bmv.transportWright();
        //bmv.maxSpeed(240, 190, 251);
        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, Car.Carcase.CROSSOVER);
        //kia.transportWright();

        Truck zilBull = new Truck("ЗИЛ", "Бычок", 25, Truck.LiftingCapacity.N2);
        //zilBull.transportWright();
        //zilBull.bestCircleTime(195, 210, 204);
        System.out.println(zilBull);
        Truck eurotent = new Truck("Евротент", "", 25, Truck.LiftingCapacity.N1);
        //eurotent.transportWright();
        //eurotent.pitStop(10);
        System.out.println(eurotent);
        Truck gazel = new Truck("Газель", "", 20, Truck.LiftingCapacity.N3);
        //gazel.transportWright();

        Truck zil = new Truck("ЗИЛ", "", 20, Truck.LiftingCapacity.N1);
        //zil.transportWright();
        //zil.maxSpeed(167, 195, 187);

        Bus uno = new Bus("MAN", "Lion's City", 25, Bus.SeatCapacity.SMALL);
        //uno.transportWright();
        //uno.startMotion();
        //uno.pitStop(9);
        System.out.println(uno);
        Bus duo = new Bus("VolgaBus", "5270GH", 30, Bus.SeatCapacity.BIG);
        //duo.transportWright();
        //duo.bestCircleTime(251, 358, 370);
        System.out.println(duo.getCapacity());
        Bus tres = new Bus("ЛИАЗ", "6231", 25, null);
        //tres.transportWright();
        //tres.maxSpeed(120, 200, 196);
        System.out.println(tres);
        tres.determineCarType();

        Bus quatro = new Bus("УАЗ", "Буханка", 35, Bus.SeatCapacity.AVERAGE);
        //quatro.transportWright();
        //quatro.maxSpeed(150, 210, 240);

        DriverB b = new DriverB("Иванов Иван Иванович", 5, lada);
        //System.out.println(b);

        DriverC c = new DriverC("Колосков Дмитрий Попович", 8, gazel);
        //System.out.println(c);

        DriverD d = new DriverD("Малицкий Николай Степанович", 4, duo);

        //audi.registration(b);
        //zilBull.registration(c);
        //tres.registration(d);



    }
}