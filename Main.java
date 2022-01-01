public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment12 = service.calculate(1_000_000, 9.99, 12);
        double payment24 = service.calculate(1_000_000, 9.99, 24);
        double payment36 = service.calculate(1_000_000, 9.99, 36);
        System.out.printf("Ваш ежемесячный платёж на 12 месяцев составляет %.0f %n", payment12);
        System.out.printf("Ваш ежемесячный платёж на 24 месяцев составляет %.0f %n", payment24);
        System.out.printf("Ваш ежемесячный платёж на 36 месяцев составляет %.0f %n", payment36);
    }
}