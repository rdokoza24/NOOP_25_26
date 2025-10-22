package pckg_VJ_1_ZD1B;

public class DivisionStrategy implements CalculationStrategy {

    @Override
    public Double performCalculation(Double fst, Double snd) {
        if (snd == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return fst / snd;
    }
}
