package transport;
import java.time.LocalDate;
import java.util.Calendar;


public class Car {
    private String brand;
    private String model;
    double engineVolume;
    String color;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String carcase;
    String registrationNumber;
    private int numberOfSeats;
    String typeOfTires;
    private Key key;
    private Insurance insurance;

    public static class Key {
        private String remoteEngineStart;
        private String keylessEntry;

        public Key(String remoteEngineStart, String keylessEntry) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank() || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "данные отсутствуют";
            } else { this.remoteEngineStart = remoteEngineStart; }
            if (keylessEntry == null || keylessEntry.isEmpty() || keylessEntry.isBlank()) {
                this.keylessEntry = "данные отсутствуют";
            } else { this.keylessEntry = keylessEntry; }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank() || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "данные отсутствуют";
            } else { this.remoteEngineStart = remoteEngineStart; }
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(String keylessEntry) {
            if (keylessEntry == null || keylessEntry.isEmpty() || keylessEntry.isBlank()) {
                this.keylessEntry = "данные отсутствуют";
            } else { this.keylessEntry = keylessEntry; }
        }
        public void keyWright() {
            System.out.println("Удаленный запуск двигателя " + remoteEngineStart + ", бесключевой доступ " + keylessEntry);
        }

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (this.key == null) {
            this.key = key;}
    }

    public static class Insurance {
        private int duration;
        private int cost;
        private int number;
        int durationDate;


        public Insurance(int duration, int cost, int number) {
            if (duration >= 0) {
                this.duration = duration;
            } else { this.duration = 0; }
            if (cost <= 0) {
                this.cost = 1_500;
            } else { this.cost = cost; }
            if (number < 0) {
                this.number = 000_000_001;
            } else { this.number = number; }
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            if (duration >= 0) {
                this.duration = duration;
            } else { this.duration = 0; }
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            if (cost <= 0) {
                this.cost = 1_500;
            } else { this.cost = cost; }
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            if (number < 0) {
                this.number = 000_000_001;
            } else { this.number = number; }
        }

        public void checkDuration(int durationDate) {
            if (LocalDate.now().getYear() > durationDate + this.duration) {
                System.out.println("Необходимо как можно скорее оформить страховку!");
            }
        }
        public void checkNumber() {
            char[] array = Integer.toString(number).toCharArray();
            if (array.length < 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }
    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (this.insurance == null) {
            this.insurance = insurance;}
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume,
               String transmission, String carcase, String registrationNumber, int numberOfSeats, String typeOfTires) {
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
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (carcase == null || carcase.isEmpty() || carcase.isBlank()) {
            this.carcase = "default";
        } else {
            this.carcase = carcase;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (typeOfTires.equals("зимняя") || typeOfTires.equals("летняя")) {
            this.typeOfTires = typeOfTires;
        } else {
            this.typeOfTires = "default";
        }

    }

    public void carWright() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, страна сборщик " + productionCountry +
                ", цвет кузова " + color + ", объем двигателя " + engineVolume + ", коробка передач " + transmission + ", тип кузова " +
                carcase + ", регистрационный номер " + registrationNumber + ", количество мест " + numberOfSeats + ", резина " +
                typeOfTires);
    }
    public void changeTires() {
        if (Calendar.MONTH > 2 && Calendar.MONTH < 10) {
            this.typeOfTires = "летняя";
        } else { this.typeOfTires = "зимняя"; }
    }

    public void checkRegistrationNumber() {
        if (!Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1)) &&
                Character.isDigit(registrationNumber.charAt(2)) && Character.isDigit(registrationNumber.charAt(3)) &&
                !Character.isDigit(registrationNumber.charAt(4)) && !Character.isDigit(registrationNumber.charAt(5)) &&
                Character.isDigit(registrationNumber.charAt(6)) && Character.isDigit(registrationNumber.charAt(7)) &&
                Character.isDigit(registrationNumber.charAt(8))) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "неверно указан регистрационный номер";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getCarcase() {
        return carcase;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission (String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
}
