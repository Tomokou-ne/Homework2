public class Main {
    public static void main(String[] args) {
        //Задание 1
        int year = 2022;
        checkLeapYear(year);
        // Задание 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        int currentYear = 2022;
        checkClientDevice(clientOS, clientDeviceYear, currentYear);
        // Задание 3
        int deliveryDistance = 95;
        String deliveryDays = calculateTime(deliveryDistance);
        System.out.println(deliveryDays);
    }
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
    public static void checkClientDevice(int clientOS, int clientDeviceYear, int currentYear) {
        if (clientDeviceYear >= currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static String calculateTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = deliveryTime +1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime +2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime +3;
        }return "Потребуется дней: " + deliveryTime;
    }

}




