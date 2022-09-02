public class Main {

    /*ПЕРВЫЙ ТАСК*/

    public static int leapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        return year;
    }



    /*ВТОРОЙ ТАСК*/

    public static <clientOS> int versionApplication(int period_production, int clientOS) {
        if (period_production >= 2015) {
            System.out.println("Приложение работает корректно.");
        } else if (period_production < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке:");
            } else {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке:");
            }
        }
        return period_production;
    }



    /*ТРЕТИЙ ТАСК*/

    public static int deliveryDistance(int delivery_distance) {
        if (delivery_distance > 60 && delivery_distance <= 100) {
            System.out.println("Потребуется дней: 3 дня." );
        } else if (delivery_distance > 20 && delivery_distance <= 60) {
            System.out.println("Потребуется дней: 2 дня.");
        } else if (delivery_distance <= 20) {
            System.out.println("Потребуется дней: 1 день.");
        }
        return delivery_distance;
    }



    /*ЧЕК-ТАЙМ*/

    public static void main(String[] args) {

        int year = 2020;
        String leap_year = String.valueOf(leapYear(year));//под первый таск

        int clientOS = 1;
        int year_production = 2016;//под второй таск

        int delivery_distance = 95;//под третий таск

        System.out.println(leap_year);
        System.out.println(versionApplication(year_production, clientOS));
        System.out.println(deliveryDistance(delivery_distance));
    }
}