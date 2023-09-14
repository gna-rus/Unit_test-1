
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    public static void main(String[] args) {
        // Значение скидки выставляется от 0 до 1
        System.out.println("Тестирование расчетов скидки");
        Calculator Cost = new Calculator();

        assertThat(Cost.calculateDiscount(100, 0.1)).isEqualTo(90);
        assertThat(Cost.calculateDiscount(12, 0)).isEqualTo(12);
        assertThat(Cost.calculateDiscount(120, -0.1)).isEqualTo(132);
        assertThat(Cost.calculateDiscount(-1000, 0.1)).isEqualTo(-900);
        assertThat(Cost.calculateDiscount(100, 1.1)).isEqualTo(90);


    }
}
