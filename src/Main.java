public class Main {
    public static void main(String[] args) {
        System.out.println("\tЗадание №1:");
        task1();
        System.out.println("\tЗадание №2:");
        task2();
        System.out.println("\tЗадание №3:");
        task3();
        System.out.println("\tЗадание №4:");
        task4();
        System.out.println("\tЗадание №5:");
        task5();
        System.out.println("\tЗадание №6:");
        task6();
        System.out.println("\tЗадание №7:");
        task7();
        System.out.println("\tЗадание №8:");
        task8();
    }

    public static void task1 () {
        int intVar = 10_000_000;
        byte byteVar = (byte)5;
        short shortVar = (short)15000;
        long longVar = 5_000_000_000_000_002L;
        float floatVar = 500.76F;
        double doubleVar = 10.555_555_555;

        System.out.println("Значение переменной intVar с типом int равно " + intVar + ".");
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar + ".");
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar + ".");
        System.out.println("Значение переменной longVar с типом long равно " + longVar + ".");
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar + ".");
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar + ".");
    }

    public static void task2 () {
        float floatVar = 27.12F;
        long longVar = 987_678_965_549L;
        double doubleVar = 2.786;
        int intVar1 = 569;
        int intVar2 = -159;
        short shortVar = (short)27897;
        byte byteVar = (byte)67;

        System.out.println("Значение переменной floatVar с типом float равно " + floatVar + ".");
        System.out.println("Значение переменной longVar с типом long равно " + longVar + ".");
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar + ".");
        System.out.println("Значение переменной intVar1 с типом int равно " + intVar1 + ".");
        System.out.println("Значение переменной intVar2 с типом int равно " + intVar2 + ".");
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar + ".");
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar + ".");

    }

    public static void task3 () {
        int sheetsTotal = 480;
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;

        int sheetPerPupil = sheetsTotal/(class1+class2+class3);
        System.out.println("На каждого ученика рассчитано " + sheetPerPupil + " листов бумаги");
    }

    public static void task4 () {
        int machinePerformancePerTwoMinutes = 16; // Производительность за 2 мин из условия
        int machinePerformancePerMinute = machinePerformancePerTwoMinutes/2; // Производительность за 1 мин

        int machinePerformancePer20Minutes = machinePerformancePerMinute*20; // Производительность за 20 мин
        System.out.println("4.1 За 20 минут машина произвела "+machinePerformancePer20Minutes+" штук бутылок");
        int machinePerformancePerDay = machinePerformancePerMinute*24*60; // Производительность за 1 день
        System.out.println("4.2 За 1 день машина произвела "+machinePerformancePerDay+" штук бутылок");
        int machinePerformancePer3Days = machinePerformancePerDay*3; // Производительность за 3 дня
        System.out.println("4.3 За 3 дня машина произвела "+machinePerformancePer3Days+" штук бутылок");
        int machinePerformancePerMonth = machinePerformancePerDay*31; // Производительность за 1 месяц
        System.out.println("4.4 За 1 месяц машина произвела "+machinePerformancePerMonth+" штук бутылок");
    }

    public static void task5 () {
        int totalCansOfPaint = 120;
        int cansOfWhitePaintPerRoom = 2;
        int cansOfBrownPaintPerRoom = 4;

        int totalRooms = totalCansOfPaint/(cansOfWhitePaintPerRoom+cansOfBrownPaintPerRoom);
        int totalWhitePaint = totalRooms*cansOfWhitePaintPerRoom;
        int totalBrownPaint = totalRooms*cansOfBrownPaintPerRoom;

        System.out.println("В школе, где "+totalRooms+" классов, " +
                "нужно "+totalWhitePaint+" банок белой краски " +
                "и "+totalBrownPaint+" банок коричневой краски");
    }

    public static void task6 () {
        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int rawEggs = 4*70;

        int totalGrams = bananas+milk+iceCream+rawEggs;
        double totalKilograms = (double) totalGrams/1000;
        System.out.println("Результат в граммах и килограммах: " + totalGrams);
        System.out.println("Результат в килограммах: " + totalKilograms);
    }

    public static void task7 () {
        int loseGramsPerDay1 = 250;
        int loseGramsPerDay2 = 500;
        int totalKgToLose = 7;
        int totalGramToLose = totalKgToLose*1000;
        int daysToLoseTotalGrams1 = totalGramToLose/loseGramsPerDay1;
        int daysToLoseTotalGrams2 = totalGramToLose/loseGramsPerDay2;

        System.out.println(daysToLoseTotalGrams1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysToLoseTotalGrams2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int daysMedian = (daysToLoseTotalGrams1+daysToLoseTotalGrams2)/2;
        System.out.println("Потребуется "+daysMedian+" дней в среднем, чтобы добиться результата похудения.");
    }

    public static void task8 () {
        int mashaMonthlyWage = 67_760;
        int densMonthlyWage = 83_690;
        int krisMonthlyWage = 76_230;

        // 10% increase per month for each employee
        int mashaMonthlyIncrease = (mashaMonthlyWage * 10)/100;
        int densMonthlyIncrease = (densMonthlyWage * 10)/100;
        int krisMonthlyIncrease = (krisMonthlyWage * 10)/100;

        //Yearly wage for each employee
        int mashaYearlyWage = mashaMonthlyWage*12;
        int densYearlyWage = densMonthlyWage*12;
        int krisYearlyWage = krisMonthlyWage*12;

        //Yearly wage + 10% monthly for each employee
        int mashaYearlyWageIncreased = (mashaMonthlyWage+mashaMonthlyIncrease)*12;
        int densYearlyWageIncreased = (densMonthlyWage+densMonthlyIncrease)*12;
        int krisYearlyWageIncreased = (krisMonthlyWage+krisMonthlyIncrease)*12;

        // Wage difference for each employee
        int mashaWageDifference = mashaYearlyWageIncreased - mashaYearlyWage;
        int densWageDifference = densYearlyWageIncreased - densYearlyWage;
        int krisWageDifference = krisYearlyWageIncreased - krisYearlyWage;

        System.out.println(mashaYearlyWage);
        System.out.println(mashaMonthlyIncrease);
        System.out.println(mashaYearlyWageIncreased);


        System.out.println("Маша теперь получает "+mashaYearlyWageIncreased+" рублей. " +
                "Годовой доход вырос на "+mashaWageDifference+" рублей");
        System.out.println("Денис теперь получает "+densYearlyWageIncreased+" рублей. " +
                "Годовой доход вырос на "+densWageDifference+" рублей");
        System.out.println("Кристина теперь получает "+krisYearlyWageIncreased+" рублей. " +
                "Годовой доход вырос на "+krisWageDifference+" рублей");

    }
}