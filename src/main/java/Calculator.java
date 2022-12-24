public class Calculator {

    private final double creditPeriod;
    private final double creditAmount;
    private final double MIR; // MonthlyInterestRate

    public Calculator(double interestRate, double creditPeriod, double creditAmount) {
        this.creditPeriod = creditPeriod;
        this.creditAmount = creditAmount;
        MIR = (interestRate / 12) / 100;
    }

    public double monthlyPayment() {
        return 0;
    }

    public double totalAmount() {
        return 0;
    }

    public double totalOverpayment() {
        return 0;
    }

}
