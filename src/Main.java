public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int savings = 15000;
        int total = 0;
        int finalGoal = 2459000;
        int i = 0;
        while (total < finalGoal) {
            total = total + total / 100;
            total = total + savings;
            i = i + 1;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        System.out.println("Задание 1.2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        int b = 10;
        for (b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 1.3");
        int population = 12_000_000;
        int birthrate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        int c = 0;
        while (c < 10) {
            population = population + birthrate - deathRate;
            c++;
        }
        System.out.println("Год " + c + ", численность населения составляет " + population);

        int deposit = 15000;
        int totalVasiliy = 0;
        int mouth = 0;
        System.out.println("Задание 2.1");
        while (totalVasiliy < 12_000_000) {
            totalVasiliy = totalVasiliy + totalVasiliy / 100 * 7;
            totalVasiliy = totalVasiliy + deposit;
            mouth++;
            System.out.println("Месяц " + mouth + ", всего накоплений в банке " + totalVasiliy + " рублей");

        }
        System.out.println("Задание 2.2");
        int depositTwo = 15000;
        int totalVasiliyTwo = 0;
        int mouthTwo = 0;
        while (totalVasiliyTwo < 12_000_000) {
            totalVasiliyTwo = totalVasiliyTwo + totalVasiliyTwo / 100 * 7;
            totalVasiliyTwo = totalVasiliyTwo + depositTwo;
            mouthTwo++;
            if (mouthTwo % 6 == 0) {
                System.out.println("Месяц " + mouthTwo + ", всего накоплений в банке " + totalVasiliyTwo + " рублей");
            }
            // в условии ничего не было сказано об органичении накопления, поэтому оставила, как в предыдущем задании
        }
        System.out.println("Задание 2.3");
        int depositThree = 15000;
        int totalVasiliyThree = 0;
        int mouthThree = 0;
        int totalTime = 12 * 9;
        while ( mouthThree < totalTime ) {
            totalVasiliyThree = totalVasiliyThree + totalVasiliyThree/100*7;
            totalVasiliyThree = totalVasiliyThree + depositThree;
            mouthThree++;
            if ( mouthThree % 6 == 0) {
                System.out.println("Сумма накоплений " + totalVasiliyThree + " рублей, месяц " + mouthThree);
            }
        }
        System.out.println("Задание 2.4");
        int friday = 6;
        for (i = 1; i < 31; i++) {
            if ( i % friday ==0 ) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("Задание 3.1");
        int year = 1822;
        while ( year < 2122 ) {
            year ++;
            if ( year % 79 == 0 ) {
                System.out.println(year);
            }
        }
        System.out.println("Задание 3.2");
        int number = 2;
        int factor = 1;
        int result = 1;
        for (factor = 1; factor <= 10; factor ++) {
            result = number * factor;
            System.out.println(number + " * " + factor + " = " + result);
        }
    }
}
