public class Calculator {
    public double calculateDiscount(int Sum, double discount) {
        if ((discount > 0) & (Sum > 0) & (discount < 1)) {
            return Sum - (Sum * discount);
        } else {
            throw new ArithmeticException("Недопустимое значение");
        }
    }
}
