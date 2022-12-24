import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;


public class Main {
    public static void main(String[] args)  {

        Car lada = new Car("Lada", "Grande", 1.7);
        lada.transportWright();
        lada.pitStop(9);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        audi.transportWright();
        audi.bestCircleTime(180, 165, 174);

        Car bmv = new Car("BMV", "Z8",3.0);
        bmv.transportWright();
        bmv.maxSpeed(240, 190, 251);

        Car kia = new Car("KIA", "Sportage 4 поколение", 2.4);
        kia.transportWright();

        Truck zilBull = new Truck("ЗИЛ", "Бычок", 25);
        zilBull.transportWright();
        zilBull.bestCircleTime(195, 210, 204);

        Truck eurotent = new Truck("Евротент", "", 25);
        eurotent.transportWright();
        eurotent.pitStop(10);

        Truck gazel = new Truck("Газель", "", 20);
        gazel.transportWright();

        Truck zil = new Truck("ЗИЛ", "", 20);
        zil.transportWright();
        zil.maxSpeed(167, 195, 187);

        Bus uno = new Bus("MAN", "Lion's City", 25);
        uno.transportWright();
        uno.startMotion();
        uno.pitStop(9);

        Bus duo = new Bus("VolgaBus", "5270GH", 30);
        duo.transportWright();
        duo.bestCircleTime(251, 358, 370);

        Bus tres = new Bus("ЛИАЗ", "6231", 25);
        tres.transportWright();
        tres.maxSpeed(120, 200, 196);

        Bus quatro = new Bus("УАЗ", "Буханка", 35);
        quatro.transportWright();
        quatro.maxSpeed(150, 210, 240);

        DriverB b = new DriverB("Иванов Иван Иванович", "есть", 8);
        System.out.println(b);

        DriverC c = new DriverC("Колосков Дмитрий Попович", "есть", 13);
        System.out.println(c);

        DriverD d = new DriverD("Малицкий Николай Степанович", "есть", 4);

        audi.registration(b);
        zilBull.registration(c);
        tres.registration(d);



    }
}