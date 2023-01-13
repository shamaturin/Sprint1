import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker st = new StepTracker();
        MonthData md = new MonthData();



        while (true) {
            printMenu();
            int i = scanner.nextInt();
            scanner.nextLine();
            if (i == 1) {
                st.addNewNumberStepsPerDay(); // здесь будет логика команды 1
            } else if (i == 2) {
                md.changeStepGoal(); // здесь будет логика команды 2
            } else if (i == 3) {
                st.printStatistic(); // здесь будет логика команды 3
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Ввести количество шагов за определённый день.");
        System.out.println("2. Изменить цель по количеству шагов в день.");
        System.out.println("3. Hапечатать статистику за определённый месяц.");
        System.out.println("4. Bыйти из приложения.");
    }
}