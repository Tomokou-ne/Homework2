public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int a = 84;
        System.out.println("Значение переменной " + "a " + "c типом " + "int " + "равно " + a);
        byte b = 120;
        System.out.println("Значение переменной " + "b " + "c типом " + "byte " + "равно " + b);
        short c = 448;
        System.out.println("Значение переменной " + "c " + "c типом " + "short " + "равно " + c);
        long d = 498525;
        System.out.println("Значение переменной " + "d " + "c типом " + "long " + "равно " + d);
        float e = 1.25f;
        System.out.println("Значение переменной " + "e " + "c типом " + "float " + "равно " + e);
        double g = 1.8456825;
        System.out.println("Значение переменной " + "g " + "c типом " + "double " + "равно " + g);

        System.out.println("Задача 2");
        float variable1 = 27.12f;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        short variable5 = 569;
        short variable6 = -159;
        short variable7 = 27897;
        byte variable8 = 67;

        System.out.println("Задача 3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        int totalStudents = teacherEA + teacherAS + teacherLP;
        short totalPaper = 480;
        int oneStudentPaper = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги");

        System.out.println("Задача 4");
        byte productTwoMin = 16;
        byte twoMinInTwenty = 20 / 2;
        int productTwentyMin = productTwoMin * twoMinInTwenty;
        System.out.println("За 20 минут машина произвела бутылок " + productTwentyMin + " штук");
        int productOneHour = productTwentyMin * 3;
        System.out.println("За один час машина произвела бутылок " + productOneHour + " штук");
        int productThreeDays = productOneHour * 72;
        System.out.println("За 3 днямашина произвела бутылок " + productThreeDays + " штук");
        long productOneMonth = productThreeDays * 10;
        System.out.println("За один месяц машина произвела бутылок " + productOneMonth + " штук");

        System.out.println("Задача 5");
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClassPaint = whitePaint + brownPaint;
        byte totalPaint = 120;
        int classes = totalPaint / oneClassPaint;
        int totalWhite = classes * whitePaint;
        int totalBrown = classes * brownPaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("Задача 6");
        byte banana = 80;
        byte amountBanana = 5;
        int totalBanana = banana * amountBanana;
        short milk = 105;
        byte amountMilk = 2;
        int totalMilk = milk * amountMilk;
        byte iceCream = 100;
        byte amountIceCream = 2;
        int totalIceCream = iceCream * amountIceCream;
        byte egg = 70;
        byte amountEgg = 4;
        int totalEgg = egg * amountEgg;
        int totalBreakfast = totalBanana + totalMilk + totalIceCream + totalEgg;
        float totalBreakfastKilo = totalBreakfast / 1000;
        System.out.println("Общий вес завтрака составляет " + totalBreakfastKilo + " кг");

        System.out.println("Задача 7");
        short loseWeightOne = 250;
        short loseWeightTwo = 500;
        short loseWeightTotal = 7000;
        int daysOne = loseWeightTotal / loseWeightOne;
        int daysTwo = loseWeightTotal / loseWeightTwo;
        int averageDays = (daysOne + daysTwo) / 2;
        System.out.println("Для того чтобы сбросить 7 кг, спортсмену потребуется в среднем " + averageDays + " день");

        System.out.println("Задача 8");
        float salaryIncrease = (float) 1.1;
        long salaryMaryPerMonth = 67760;
        int salaryMaryTotal= (int) (salaryMaryPerMonth * 12);
        int increaseSalaryMary = (int) (salaryIncrease * salaryMaryPerMonth);
        int newTotalSalaryMary = increaseSalaryMary * 12;
        int diffSalaryMary = newTotalSalaryMary - salaryMaryTotal;
        System.out.println("Маша теперь получает " + increaseSalaryMary + " рублей в месяц. Годовой доход вырос на " + diffSalaryMary + " рублей в год");
        long salaryDenisPerMonth = 83690;
        int salaryDenisTotal = (int) (salaryDenisPerMonth * 12);
        int increaseSalaryDenis = (int) (salaryIncrease * salaryDenisPerMonth);
        int newTotalSalaryDenis = increaseSalaryDenis * 12;
        int diffSalaryDenis = newTotalSalaryDenis - salaryDenisTotal;
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей в месяц. Годовой доход вырос на " + diffSalaryDenis + " рублей в год");
        long salaryCristinePerMonth = 76230;
        int salaryCristineTotal = (int) (salaryCristinePerMonth * 12);
        int increaseSalaryCristine = (int) (salaryIncrease * salaryCristinePerMonth);
        int newTotalSalaryCristine = increaseSalaryCristine * 12;
        int diffTotalSalaryCristine = newTotalSalaryCristine - salaryCristineTotal;
        System.out.println("Кристина теперь получает " + increaseSalaryCristine + " рублей в месяц. Годовой доход вырос на " + diffTotalSalaryCristine + " рублей в год");

    }
}