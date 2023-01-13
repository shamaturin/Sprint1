import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    Converter cv = new Converter();
    MonthData md = new MonthData();



    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();// ввод и проверка номера месяца
        if (month < 0 || month > 12) {
            System.out.println("Ошибка. Введите число от 0 до 11.");
            return;
        }


        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();// ввод и проверка дня
        if (day < 1 || day > 30) {
            System.out.println("Ошибка. Введите число от 1 до 30.");
            return;
        }

        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();// ввод и проверка количества шагов
        if (steps < 1) {
            System.out.println("Введите число больше 0");
            return;
        }
        md.daysInMonth[month - 1][day - 1] = steps;
        System.out.println("Значение сохранено!");// сохранение данных

    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month=scanner.nextInt();
        if (month < 0 || month >12) {
            System.out.println("ОШИБКА, введите число от 1 до 12");
            return;
        }
        md.printDaysAndStepsFromMonth(month);
        System.out.println("Количество шагов за выбранный месяц состовляет: " + md.sumStepsFromMonth(month));
        md.maxSteps(month);
        md.averageStepsInMonth(month);
        cv.convertToKm(month);// вывод пройденной за месяц дистанции в км
        cv.convertStepsToKilocalories(month);// вывод количества сожжённых килокалорий за месяц
        md.bestSeries(month);// вывод лучшей серии
        System.out.println(); //дополнительный перенос строки
    }
}