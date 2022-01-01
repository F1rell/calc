public class CreditPaymentService {
    public double calculate(double credit, double percent, double duration) {
        double percentMonths = percent / 100 / 12;
        double qwe = 1 + percentMonths;
        double qre =-duration;
        double stepen = Math.pow(qwe , qre);
        double sum = 1 - stepen;
        double delenie = percentMonths / sum;
        double payment = credit * delenie;
        return payment;
    }
}