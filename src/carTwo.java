public class carTwo {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    carTwo(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else { this.brand = brand; }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else { this.model = model; }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else { this.engineVolume = engineVolume; }
        if ( color == null || color.isEmpty()) {
            this.color = "белый";
        } else { this.color = color; }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else { this.productionYear = productionYear;}
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else { this.productionCountry = productionCountry; }
    }

    void carTwo() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, страна сборщик " + productionCountry +
                ", цвет кузова " + color + ", объем двигателя " + engineVolume);
    }
}
