import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        int min = 100_000;
        int max = 200_000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * (max - min)) + min);
        }
        /* Небольшая проверка работы массива
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(",");
        }
        System.out.println(" ");
             */
        //Задание 1
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей.");
        // Задание 2
        Arrays.sort(arr);
        //тк массив отсортирован по возрастанию чисел, то автоматически нулевое значение будет минимальным, а последнее - максимальным :)
        System.out.println("Минимальная сумма затрат в месяц " + arr[0] + " рублей.");
        System.out.println("Мксимальная сумма затрат в месяц " + arr[29] + " рублей.");
        // Задание 3
        int sumAver = 0;
        for (int element : arr) {
            sumAver += element;
        }double average = sumAver / 30;
        System.out.println("Сумма затрат за месяц составила " + average + " рублей.");
        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }

        }
    }
