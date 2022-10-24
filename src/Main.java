public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляю, ты совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Ты еще не достиг совершеннолетия, нужно непного подождать!");
        }

        System.out.println("Задание 1.2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ходит на работу");
        }

        System.out.println("Задание 1.3");
        int capacity = 102;
        int sittingPlace = 60;
        int standingPlace = capacity - sittingPlace;

        int seatUsed = 54;
        int standUsed = 35;
        int usedPlaces = seatUsed + standUsed;
        if (seatUsed < sittingPlace) {
            System.out.println("Сидячих меств в вагоне свободно " + (sittingPlace - seatUsed));
        }
        if (standUsed < standingPlace) {
            System.out.println("Стоячих мест в вагоне свободно " + (standingPlace - standUsed));
        }
        if (usedPlaces == capacity) {
            System.out.println("Вагон полон");
        }

        System.out.println("Задание 2.1");
        int yearsOld = 28;
        if (yearsOld >= 18) {
            System.out.println("Поздравляю, ты совершеннолетний!");
        } else {
            System.out.println("Ты еще не достиг совершеннолетия, нужно непного подождать!");
        }

        System.out.println("Задание 2.2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек ходит в университет");
        } else {
            System.out.println("Человек окончил университет и ходит на работу");
        }

        System.out.println("Задание 2.3");
        int holdingCapacity = 102;
        int sittingRoom = 60;
        int standingRoom = holdingCapacity - sittingRoom;

        int occupiedSittingRoom = 53;
        int occupiedStandingRoom = 41;
        int occupiedTotal = occupiedStandingRoom + occupiedSittingRoom;
        if (occupiedSittingRoom < sittingRoom) {
            System.out.println("Сидячих меств в вагоне свободно " + (sittingPlace - seatUsed));
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (occupiedStandingRoom < standingRoom) {
            System.out.println("Стоячих мест в вагоне свободно " + (standingPlace - standUsed));
        } else {
            System.out.println("Стоячих мест нет");}
        if (occupiedTotal == holdingCapacity) {
                System.out.println("Вагон полон");
            }
        else {
                System.out.println("В вагоне есть свободные места");}

        System.out.println("Задание 3.1");
        int personAge = 16;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge +", то ему нужно ходить в детский сад");}
        else if (personAge >= 7 && personAge <= 18) {
            System.out.println("Если возраст человека равен " + personAge +", то ему нужно ходить в школу");}
        else if (personAge > 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge +", то ему нужно ходить в университет");}
        else {
            System.out.println("Если возраст человека равен " + personAge +", то ему нужно ходить на работу");}

        System.out.println("Задание 3.2");
        int childAge = 6;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");}
        else if (childAge >= 5 && childAge < 14) {
            System.out.println("Ребенку можно кататься на аттракционе только в сопровождении взрослого");}
        else if (childAge >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");}

        System.out.println("Задание 3.3");
        int one = 75;
        int two = 856;
        int three = 9;
        if (one > two) {
            if (one > three) {
                System.out.println("БОльшее число " + one);
            } else if (one < three) {
                System.out.println("БОльшее число " + three);
            } else if (one == three) {
                System.out.println("Числа " + one + " и " + three + " равны");
            }
        }
        else if (two > one) {
            if (two > three) { System.out.println("БОльшее число " + two);}
            else if (three > two) {
                System.out.println("БОльшее число " + three);}
            else if (two == three) {
                System.out.println("Числа " + two + " и " + three + " равны");
            }
        }
        else if (one == three && two == three) {
            System.out.println("Числа " + one + " , " + two + " и " + three + " равны");}




        }
    }
