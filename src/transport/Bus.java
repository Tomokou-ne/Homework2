package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getProductionYear() + " года выпуска, страна сборщик " + getProductionCountry() +
                ", цвет кузова " + getColor() + ", максимальная скорость " + getMaxSpeed() + " км/час";
    }




}
