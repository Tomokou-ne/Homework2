import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;


public class Main {

    public static void main(String[] args)  {

        Car lada = new Car("Lada", "Grande", 1.7, Car.Carcase.SEDAN);
        //System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.Carcase.HATCHBACK);
        Car bmv = new Car("BMV", "Z8",3.0, Car.Carcase.PICKUP);
        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4, Car.Carcase.CROSSOVER);

        Truck zilBull = new Truck("ЗИЛ", "Бычок", 25, Truck.LiftingCapacity.N2);
        //System.out.println(zilBull);
        Truck eurotent = new Truck("Евротент", "", 25, Truck.LiftingCapacity.N1);
        //System.out.println(eurotent);
        Truck gazel = new Truck("Газель", "", 20, Truck.LiftingCapacity.N3);
        Truck zil = new Truck("ЗИЛ", "", 20, Truck.LiftingCapacity.N1);

        diagnose(
                lada, audi, bmv, kia,
                zil, zilBull, gazel, eurotent
        );

        Bus uno = new Bus("MAN", "Lion's City", 25, Bus.SeatCapacity.SMALL);
        //System.out.println(uno);
        Bus duo = new Bus("VolgaBus", "5270GH", 30, Bus.SeatCapacity.BIG);
        //System.out.println(duo.getCapacity());
        Bus tres = new Bus("ЛИАЗ", "6231", 25, null);
        //System.out.println(tres);
        //tres.determineCarType();
        Bus quatro = new Bus("УАЗ", "Буханка", 35, Bus.SeatCapacity.AVERAGE);

        DriverB b = new DriverB("Иванов Иван Иванович", 5, lada);
        DriverC c = new DriverC("Колосков Дмитрий Попович", 8, gazel);
        DriverD d = new DriverD("Малицкий Николай Степанович", 4, duo);

    }
    public static void diagnose(Transport... transports){
        for (Transport transport : transports) {
            if (!transport.diagnose()) {
                try{
                    throw new RuntimeException("Авто " + transport.getBrand() + " " + transport.getModel() +" не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }

            }

        }

    }
}