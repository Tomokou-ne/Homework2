package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }
    @Override
    public String toString() {
        return brand + model + productionYear + " года выпуска, страна сборщик " + productionCountry +
                ", цвет кузова " + color + ", максимальная скорость " + maxSpeed + " км/час";
    }




}
