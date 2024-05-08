public class Main {
    //Задача №1
    private static void checkYearAndPrint(int numbers) {
        if (numbers > 1584 && (numbers % 4 == 0 && numbers % 100 != 0 || numbers % 400 == 0)) {
            System.out.printf("Год %s является высокосным", numbers);
        } else {
            System.out.printf("Год %s не является высокосным", numbers);
        }

    }

    //Задача №2
    private static void getYearAndOCAndPrint(int OC, int year, int currentYear) {
        if (OC == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (OC == 0 && year >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (OC == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OC == 1 && year >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Приложение не установится");
        }

    }

    //Задача №3
    private static String getDistanceDaysAndPrint(int distance) {
        int days = 1;
        if (distance <= 20) {
            return "Потребуется дней: " + days;
        } else if (distance > 20 && days <= 60) {
            return ("Потребуется дней: " + (days + 1));
        } else if (distance > 60 && days <= 100) {
            return ("Потребуется дней: " + (days + 2));
        } else if (distance > 100) {
            return ("Доставки нет");
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача №1
        int year = 2024;
        checkYearAndPrint(year);
        System.out.println();
        //Задача №2
        int clientDeviceYear = 2021;
        int clientDeviceOC = 1;
        int borderYear = 2015;
        getYearAndOCAndPrint(clientDeviceOC, clientDeviceYear, borderYear);
        //Задача №3
        int deliveryDistance = 95;
        System.out.println(getDistanceDaysAndPrint(deliveryDistance));


    }

}