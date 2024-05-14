public class Main {
    //Задача №1
    private static void checkYearAndPrint(int years) {
        if (years > 1584 && (years % 4 == 0 && years % 100 != 0 || years % 400 == 0)) {
            System.out.printf("Год %d является высокосным", years);
        } else {
            System.out.printf("Год %d не является высокосным", years);
        }

    }

    //Задача №2
    private static void getYearAndOCAndPrint(int ocType, int currentYear, int year) {
        if (ocType == 0 && currentYear < year) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (ocType == 0 && currentYear >= year) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (ocType == 1 && currentYear < year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (ocType == 1 && currentYear >= year) {
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
        } else if (distance > 20 && distance <= 60) {
            return ("Потребуется дней: " + (days + 1));
        } else if (distance > 60 && distance <= 100) {
            return ("Потребуется дней: " + (days + 2));
        } else if (distance > 100) {
           return "Доставки нет";
        }
        return days + "";
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
        int deliveryDistance = 102;
        System.out.println(getDistanceDaysAndPrint(deliveryDistance));


    }

}