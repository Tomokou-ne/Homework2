package transport;

import driver.Driver;

public class Transport <T extends Driver & Competing> {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void transportWright() {
        System.out.println(brand + " " + model + ", объем двигателя " + engineVolume );
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void startMotion() {
        System.out.println("Начать движение!");

    }
    public void stopMotion() {
        System.out.println("Остановить движение");
    }
    public void registration(T driver) {
        System.out.println("Водитель " + driver.getInitials() + " управляет автомобилем " + brand + " и будет участвовать в заезде");
    }


}
