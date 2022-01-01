public class CreditPaymentService {
    public double calculate(double credit, double percent, double duration) {
        double percentMonths = percent / 100 / 12; // процент в месяц
        double sum = 1 + percentMonths; // расчёты по формуле
        double negative =-duration; // перевод в отрицательное значение для дальнейшего корректного расчёта по формуле
        double stepen = Math.pow(sum , negative); // возведение в степень - степень это срок кредита
        double subtraction = 1 - stepen; // расчёты по формуле
        double delenie = percentMonths / subtraction; // расчёты по формуле
        double payment = credit * delenie; // расчёты по формуле
        return payment;
    }
}