public class Main {
    public static void main(String[] args) {
        //Задача 1
        int apple = 3;
        System.out.println("Значение переменной с типом int равно " + apple);
        byte banannas = 9;
        System.out.println("Значение переменной с типом byte равно " + banannas );
        short city = 123;
        System.out.println("Значение переменной с типом short равно " + city);
        long fruit = 111;
        System.out.println("Значение переменной с типом long равно " + fruit);
        float gool = 8;
        System.out.println("Значение переменной с типом float равно " + gool);
        double ing = 1.8;
        System.out.println("Значение переменной с типом double равно " + ing);

        //Задача2
        double green = 27.12;
        System.out.println(green);
        long lotte = 987768965549L;
        System.out.println(lotte);
        double party = 2.786;
        System.out.println(party);
        short day = 569;
        System.out.println(day);
        short many = -159;
        System.out.println(many);
        int had = 27897;
        System.out.println(had);
        byte hand = 67;
        System.out.println(hand);

        //Задача3
        int a = 23;
        System.out.println(a);
        int b = 27;
        System.out.println(b);
        int c = 30;
        System.out.println(c);
        short leaf = 480;
        System.out.println(leaf);
        int y = a + b + c;
        System.out.println(y);
        int sheets = leaf / y;
        System.out.println("«На каждого ученика рассчитано " + sheets + " листов бумаги».");

        //Задача4
        int minute = 20;
        System.out.println(minute);
        int bottle = 20 / 2 * 16;
        System.out.println("«За " + minute + " машина произвела " + bottle + " штук бутылок».");
        short Day = 1440;
        System.out.println(Day);
        short bottles = 1440 / 2 * 16;
        System.out.println("«За " + Day + " машина произвела " + bottles + " штук бутылок».");
        short Days = 4320;
        System.out.println(Days);
        int Bottle = 4320 / 2 * 16;
        System.out.println("«За " + Days + " машина произвела " + Bottle + " штук бутылок».");
        int month = 43200;
        System.out.println(month);
        int Bottles = 43200 / 2 * 16;
        System.out.println("«За " + month + " машина произвела " + Bottles + " штук бутылок».");

        //Задача5
        int pot = 120;
        System.out.println(pot);
        int room = pot / 6;
        System.out.println(room);
        int paintWhite = room * 2;
        System.out.println(paintWhite);
        int paintBrown = 20 * 4;
        System.out.println(paintBrown);
        System.out.println("«В школе, где " + room + " классов, нужно " + paintWhite + " банок белой краски и " + paintBrown + " банок коричневой краски».");

        //Задача6
        int banana = 5 * 80;
        System.out.println(banana);
        int milk = 210;
        System.out.println(milk);
        int iceCream = 4 * 70;
        System.out.println(iceCream);
        int gram = banana + milk + iceCream;
        System.out.println("Общая сумма граммов " + gram);
        double kilo = 0.89;
        System.out.println("В килогграмах " + kilo);

        //задача7
        short days = 7000 / 250;
        System.out.println("В среднем понадобиться " + days + " дней");
        int time = 7000 / 500;
        System.out.println("В среднем понадобиться " + time +" дней");

        //Задача8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int crestinaSalary = 76230;

        double indexPercent = 1.1;
        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = denisSalary * indexPercent;
        double newCrestinaSalary = crestinaSalary * indexPercent;

        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;

        double annualDenisSalary = 12 * denisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;

        double annualCrestinaSalary = 12 * crestinaSalary;
        double  newAnnualCrestinaSalary = 12 * newCrestinaSalary;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + "рублей».");
        System.out.println("Маша теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + "рублей».");
        System.out.println("Маша теперь получает " + newCrestinaSalary + " рублей. Годовой доход вырос на " + (newAnnualCrestinaSalary - annualCrestinaSalary) + "рублей».");
    }
}


