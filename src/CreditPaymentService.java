public class CreditPaymentService {
        public double calculate(int creditAmount, int creditPeriod, double interestRate) {

            double monthlyInterestRate = interestRate / 12 / 100;
            double a = Math.pow((monthlyInterestRate + 1), creditPeriod);
            double d = creditAmount * (monthlyInterestRate + monthlyInterestRate / (a - 1));
        int monthlyPayment = (int) d;

        return monthlyPayment;
    }
}
