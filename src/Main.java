public class Main {
    public static void main(String[] args) {

        Human max = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        max.humanWright();
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anya.humanWright();
        Human kate = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        kate.humanWright();
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        artem.humanWright();
        Human vladimir = new Human(2001, "Владимир", "Казань", "пока не работает");
        vladimir.humanWright();
        System.out.println(vladimir.getYearOfBirth());
        System.out.println(vladimir.getTown());


        Flower rose = new Flower("Роза обыкновенная", " ", "Голландия", 35.59, 0);
        rose.setFlowerColor("красный");
        rose.flowerWright();
        System.out.println(rose.getFlowerColor());
        Flower chrysanthem = new Flower("Хризантема", " ", " ", 15, 5);
        chrysanthem.setCountry("Китай");
        chrysanthem.flowerWright();
        System.out.println(chrysanthem.getCountry());
        Flower pion = new Flower("Пион", " ", "Англия", 69.9, 1);
        pion.setFlowerColor("розовый");
        pion.flowerWright();
        System.out.println(pion.getCountry());
        Flower gypsophila = new Flower("Гипсофила", " ", "Турция", 19.5, 10);
        gypsophila.flowerWright();
        System.out.println(gypsophila.getCost());


    }
}