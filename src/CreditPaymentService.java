public class CreditPaymentService {
    public int calculate(long creditRub, double annualRate, int periodMonths) {
        double monthRate = annualRate / 12 / 100; // месячная процентная ставка по кредиту
        double coefficient = (monthRate * Math.pow((1 + monthRate), periodMonths)) / (Math.pow((1 + monthRate), periodMonths) - 1); // коэффициент аннуитета
        double payment = creditRub * coefficient; // аннуитетный платеж
        return ((int) payment);
    }
}
