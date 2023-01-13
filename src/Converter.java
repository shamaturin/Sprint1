class Converter {

        MonthData md = new MonthData();

        double kmK = 0.075;
        int formulaKiloKal = 50000;
        void convertToKm(int month) {
        System.out.println("Количество километров пройденных в этом месяце: " + md.sumStepsFromMonth(month) * kmK);
        }
        //md.sumStepsFromMonth(month) Шаги -> метры (один шаг равен 75 см)
        void convertStepsToKilocalories(int month){
        System.out.println("Количество сожжённых килокалорий в этом месяце: " + md.sumStepsFromMonth(month) * formulaKiloKal); }
//Шаги -> калории (1 шаг = 50 калорий)
        }