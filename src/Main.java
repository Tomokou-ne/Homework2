public class Main {
    public static void main(String[] args) {
        human max = new human();
        max.name = "Максим";
        max.yearOfBirth = 1987;
        max.town = "Минск";
        max.job = "бренд-менеджер";
        max.human();

        human anya = new human();
        anya.name = "Аня";
        anya.yearOfBirth = 1993;
        anya.town = "Москва";
        anya.job = "методист образовательных программ";
        anya.human();

        human kate = new human();
        kate.name = "Катя";
        kate.yearOfBirth = 1994;
        kate.town = "Калининград";
        kate.job = "продакт-менеджер";
        kate.human();

        human artem = new human();
        artem.name = "Артём";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.job = "директор по развитию бизнеса";
        artem.human();

        car ladaGrande = new car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "Россия";
        ladaGrande.color = "желтый";
        ladaGrande.engineVolume = 1.7;
        ladaGrande.car();

        car audiA8 = new car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германия";
        audiA8.color = "чёрный";
        audiA8.engineVolume = 3.0;
        audiA8.car();

        car bmvZ8 = new car();
        bmvZ8.brand = "BMV";
        bmvZ8.model = "Z8";
        bmvZ8.productionYear = 2021;
        bmvZ8.productionCountry = "Германия";
        bmvZ8.color = "чёрный";
        bmvZ8.engineVolume = 3.0;
        bmvZ8.car();

        car kiaSportage4 = new car();
        kiaSportage4.brand = "KIA";
        kiaSportage4.model = "Sportage 4";
        kiaSportage4.productionYear = 2018;
        kiaSportage4.productionCountry = "Южная Корея";
        kiaSportage4.color = "красный";
        kiaSportage4.engineVolume = 2.4;
        kiaSportage4.car();

        car hyundaiAvante = new car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.car();

        //Задание 2, создала отдельные классы дубликаты, чтобы можно было зафиксировать работу как 1, так и остальных заданий

        humanTwo max1 = new humanTwo(1987, "Максим", "Минск", "бренд-менеджер");
        max1.humanTwo();
        humanTwo anya1 = new humanTwo(1993, "Аня", "Москва", "методист образовательных программ");
        anya1.humanTwo();
        humanTwo kate1 = new humanTwo(1994, "Катя", "Калининград", "продакт-менеджер");
        kate1.humanTwo();
        humanTwo artem1 = new humanTwo(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artem1.humanTwo();

        carTwo lada = new carTwo("Lada", "Grande", 2015, "Россия", "жёлтый", 1.7);
        lada.carTwo();
        carTwo audi = new carTwo("Audi", "A8 50 L TDI quattro", 2020, "Германия", "чёрный", 3.0);
        audi.carTwo();
        carTwo bmv = new carTwo("BMV", "Z8", 2021, "Германия", "", 3.0);
        bmv.carTwo();
        carTwo kia = new carTwo("KIA", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4);
        kia.carTwo();
        carTwo hyundai = new carTwo("Hyundai", "", 2016, "Южная Корея", "оранжевый", 1.6);
        hyundai.carTwo();








    }





}