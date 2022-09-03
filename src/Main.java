import java.time.LocalDate;

public class Main {

    /*ПЕРВЫЙ ТАСК*/

    private static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }



    /*ВТОРОЙ ТАСК*/

    public static void printVersionApp(String clientOS, int yearProduct) {
        int currentYear = LocalDate.now().getYear();
        if (yearProduct > 2015 && yearProduct < currentYear) {
            System.out.println("Приложение будет работать корректно");
        } else if (yearProduct < 2015) {
            if (clientOS == "Android") {
                System.out.println("Установите облегчённую версию для Andoid");
            } else if (clientOS == "iOS") {
                System.out.println("Установите облегчённую версию для iOS");
            }
        }
        /*
            1). "Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно."
            2). "Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию)."
            Где правда?
         */
    }



    /*ТРЕТИЙ ТАСК*/

    public static void printDelivery(int distance) {
        if (distance > 0 && distance < 20) {
            System.out.println("Доставка займёт сутки");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Доставка займёт двое суток");
        } else if (distance >= 60 && distance < 100) {
            System.out.println("Доставка займёт трое суток");
        } else {
            System.out.println("Доставка займёт четверо суток и более");
        }
    }



    /*ЧЕК-ТАЙМ*/

    public static void main(String[] args) {
        int year = 2020; //под первый таск

        String OS = "Android";
        int yearProduct = 2016;//под второй таск

        int delivery_distanse = 95;//под третий таск

        printLeapYear(year);
        printVersionApp(OS, yearProduct);
        printDelivery(delivery_distanse);
    }
}