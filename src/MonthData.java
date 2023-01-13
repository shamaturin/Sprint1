import java.util.Scanner;

class MonthData {
    int[][] daysInMonth = new int[12][30];
    Scanner scanner = new Scanner(System.in);
    public int goalByStepsPerDay = 10000;
    void changeStepGoal() {
        System.out.println("Задайте новую цель");
        int newTarget = scanner.nextInt();
        if (newTarget < 0) {
            System.out.println("Цель не может быть меньше 0");
            return;
        }

        goalByStepsPerDay = newTarget;
    }

    void printDaysAndStepsFromMonth(int month) {
        for (int i = 0; i < 30; i++) {
            System.out.println((i + 1) + " день: " + daysInMonth[month - 1][i]); //1 день: 3000 Вывод элементов массива в необходимом формате
        }
    }

    int sumStepsFromMonth(int month) {
        int sumSteps = 0;
        for (int i = 0; i < 30; i++)
            sumSteps = sumSteps + daysInMonth[month - 1][i];
//System.out.println("Количество шагов за выбранный месяц состовляет: " + sumSteps);
// подсчёт суммы элементов массива days[]

        return sumSteps;
    }

    void maxSteps(int month) {
        int maxSteps = 0;

        for (int i = 0; i < 30; i++) {
            if (maxSteps < daysInMonth[month - 1][i])// поиск максимального элемента
                maxSteps = daysInMonth[month - 1][i];
        }
        System.out.println("Максимальное количество щагов в выбранном месяце : " + maxSteps);
    }

    void bestSeries(int month) {
        int maxCount = 0;
        int count = 0;
        for (int steps : daysInMonth[month - 1]) {
            if (steps >= goalByStepsPerDay) {
                if (++count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Максимальная серия в этом месяце составляет " + maxCount + " дней.");
    }

    void averageStepsInMonth(int month) {
        int sumSteps = sumStepsFromMonth(month);
        int average = sumSteps / daysInMonth[1].length;
        System.out.println("Среднее количество шагов в выбранном месяцу: " + average);
    }
}
