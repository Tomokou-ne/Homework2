import transport.Car;


public class Main {
    public static void main(String[] args)  {
        Car.Key distant = new Car.Key("доступен", "доступен");
        Car.Key local = new Car.Key("отсутствует", "отсутствует");

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "жёлтый", 1.7,
                " ", "седан", "h584ko965", 0, " ");
        lada.setTransmission("механическая");
        lada.changeTires();
        lada.carWright();
        lada.setKey(local);
        local.keyWright();
        System.out.println(lada.getBrand());
        Car.Insurance ladaGrande = new Car.Insurance(5, 15650, 458695);
        lada.setInsurance(ladaGrande);
        ladaGrande.checkDuration(2021);
        ladaGrande.checkNumber();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "чёрный", 3.0,
                "автоматическая", "хетчбек", "h687lj9k7", 0, " ");
        audi.changeTires();
        audi.checkRegistrationNumber();
        audi.carWright();
        audi.setKey(distant);
        distant.keyWright();
        System.out.println(audi.getModel());
        Car.Insurance audiA8 = new Car.Insurance(3, 12000, 985466254);
        audi.setInsurance(audiA8);
        audiA8.checkDuration(2015);

        Car bmv = new Car("BMV", "Z8", 2021, "Германия", "", 3.0,
                " ", "купе", "f804od695", 2, " ");
        bmv.setTransmission("автоматическая");
        bmv.changeTires();
        bmv.carWright();
        System.out.println(bmv.getProductionYear());
        bmv.setKey(distant);
        distant.keyWright();
        Car.Insurance bmvZ8 = new Car.Insurance(3, 20000, 856458954);
        bmv.setInsurance(bmvZ8);
        bmvZ8.checkDuration(2020);
        bmvZ8.checkNumber();


        Car kia = new Car("KIA", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4,
                "механическая", "кроссовер", "p008pl965", 6, " ");
        kia.changeTires();
        kia.carWright();
        System.out.println(kia.getProductionCountry());
        kia.setKey(local);
        local.keyWright();
        Car.Insurance kiaSportage4 = new Car.Insurance(5, 25000, 954856565);
        kia.setInsurance(kiaSportage4);
        kiaSportage4.checkDuration(2019);

        Car hyundai = new Car("Hyundai", "", 2016, "Южная Корея", "оранжевый", 1.6,
                "автоматическая", "микро", "l008re048", 1, " ");
        hyundai.changeTires();
        hyundai.carWright();
        System.out.println(hyundai.getCarcase());
        hyundai.setKey(local);
        local.keyWright();
        Car.Insurance hyundaiDefault = new Car.Insurance(4, 14500, 54832512);
        hyundai.setInsurance(hyundaiDefault);
        hyundaiDefault.checkDuration(2018);
        hyundaiDefault.checkNumber();

    }
}