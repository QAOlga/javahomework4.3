public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1000000;
        int creditPeriod = 12;
        double interestRate = 9.99;
        double monthlyPayment;

        monthlyPayment = service.calculate(creditAmount, 12, interestRate);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);
        monthlyPayment = service.calculate(creditAmount, 24, interestRate);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);
        monthlyPayment = service.calculate(creditAmount, 36, interestRate);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);
    }
 }

