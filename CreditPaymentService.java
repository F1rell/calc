public class CreditPaymentService {
    public double calculate(double credit, double percent, double duration) {
        double percentMonths = percent / 100 / 12; // процент в месяц
        double qwe = 1 + percentMonths; // расчёты по формуле
        double qre =-duration; // перевод в отрицательное значение для дальнейшего корректного расчёта по формуле
        double stepen = Math.pow(qwe , qre); // возведение в степень - степень это срок кредита
        double sum = 1 - stepen; // расчёты по формуле
        double delenie = percentMonths / sum; // расчёты по формуле
        double payment = credit * delenie; // расчёты по формуле
        return payment;
    }
}