public class CreditPaymentService  {
    public int calculate(int loan, int years, float interest) {
        // ежемесячная процентная стоимость i
        double i = interest / 100 / 12;
        return (int) (loan * (i + i / (Math.pow(1 + i, 12 * years) - 1)));
    }
}
