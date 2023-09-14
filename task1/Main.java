
public class Main {
    public static void main(String[] args) {

        System.out.println("Программа подсчета реальной цены");
        Calculator Cost = new Calculator();

        int Sum = 100;
        double discount = 0.1;

        double RealCost = Cost.calculateDiscount(Sum, discount);
        System.out.println("Реальная цена с учетом скидки: " + RealCost);
    }
}






