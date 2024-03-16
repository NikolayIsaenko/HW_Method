public class Homework {
    public static void main(String[] args) {
        // Задача 1
        System.out.println(" Задача 1 ");
        checkLeapYear(2021);

        // Задача 2
        System.out.println(" Задача 2 ");
        getClientOS(1, 2014);

        // Задача 3
        System.out.println(" Задача 3 ");
        checkDeliveryDistanse(80);
    }

    // Задача 1
    public static boolean checkLeapYear(int year) {
        boolean leapYear = ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year < 1584);
        if (leapYear) {
            System.out.println(year + " - Год является високосным");
        } else {
            System.out.println(year + " - Год не високосный");
        }
        return leapYear;
    }

    // Задача 2
    public static void getClientOS(int versionOS, int clientDeviceYear) {
        if (clientDeviceYear > 2015 && versionOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2015 && versionOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear > 2015 && versionOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && versionOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        return;
    }
    // Задача 3
    public static void checkDeliveryDistanse (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуются сутки на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется двое суток на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println(" Потребуются трое суток на доставку");
        } else {
            System.out.println(" Доставка невозможна");
        }
        return;
    }


}