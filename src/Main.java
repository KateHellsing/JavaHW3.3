public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int first_case = service.calculate(1_000_000, 1, 9.99F);
        int second_case = service.calculate(1_000_000, 2, 9.99F);
        int third_case = service.calculate(1_000_000, 3, 9.99F);

        System.out.println(first_case);
        System.out.println(second_case);
        System.out.println(third_case);
    }
}