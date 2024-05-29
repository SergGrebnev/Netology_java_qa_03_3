public class Main {
    public static void main(String[] args) {
        CreditPaymentService myPayment = new CreditPaymentService();
        System.out.println(myPayment.calculate(1_000_000, 9.99, 12));
        System.out.println(myPayment.calculate(1_000_000, 9.99, 24));
        System.out.println(myPayment.calculate(1_000_000, 9.99, 36));

    }
}
