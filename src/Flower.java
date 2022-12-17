public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpawn;
    private String name;

    Flower (String name, String flowerColor, String country, double cost, int lifeSpawn) {
        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else { this.flowerColor = flowerColor; }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else { this.country = country; }
        if (cost <= 0) {
            this.cost = 1;
        } else { this.cost = cost; }
        if (lifeSpawn <= 0) {
            this.lifeSpawn = 3;
        } else { this.lifeSpawn = lifeSpawn; }
    }
    void flowerWright() {
        System.out.println(name + ", цвет " + flowerColor + ", страна происхождения " + country + ", стоимость " + cost + " рублей, срок стояния (дни) " + lifeSpawn);
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else { this.flowerColor = flowerColor; }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else { this.country = country; }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else { this.cost = cost; }
    }
}
