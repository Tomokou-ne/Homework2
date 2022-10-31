public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (i = 10; i > 0; i --) {
            System.out.println(i);
        }
        System.out.println("Задание 3");
        int a = 0;
        for (a = 0; a <= 17; a = a + 2 ) {
            System.out.println(a);
        }
        System.out.println("Задание 4");
        for (a = 10; a >= (-10); a-- ) {
            System.out.println(a);
        }
        System.out.println("Задание 2.1");
        int year = 1904;
        for (year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year);
        }
        System.out.println("Задание 2.2");
        for (i = 7; i < 99; i = i +7) {
            System.out.println(i);
        }
        System.out.println("Задание 2.3");
        for (i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задание 3.1");
        int savings = 29000;
        int total = 0;
        for (int b = 1; b < 13; b++) {
            total = total + savings;
            System.out.println("Месяц " + b + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Всего за год было накоплено " + total + " рублей");
        System.out.println("Задание 3.2");
        int savingsOne = savings;
        int totalOne = 0;
        for (int b = 1; b < 13; b++) {
            totalOne = totalOne + totalOne/100;
            totalOne = totalOne + savingsOne;
            System.out.println("Месяц " + b + ", сумма накоплений равна " + totalOne + " рублей");
        }
        System.out.println("Всего за год было накоплено " + totalOne + " рублей");
     }
}