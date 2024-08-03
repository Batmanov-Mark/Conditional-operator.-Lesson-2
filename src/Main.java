public class Main {
    public static void main(String[] args) {

        // Tasc 1;
        System.out.println("Tasc 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Tasc 2;
        System.out.println("Tasc 2");

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Tasc 3;
        System.out.println("Tasc 3");

        int year = 2024;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }


        // Tasc 4;
        System.out.println("Tasc 4");

        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 ");
        } else {
            System.out.println("Потребуется дней: 3 ");
        }

        // Tasc 5;
        System.out.println("Tasc 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Неправильный номер месяца");


        }

    }
}