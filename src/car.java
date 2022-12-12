public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, страна сборщик " + productionCountry +
                ", цвет кузова " + color + ", объем двигателя " + engineVolume);
    }
}
