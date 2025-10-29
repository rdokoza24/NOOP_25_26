package pckg_VJ_1_ZD1B;

public class DivisionStrategy implements CalculationStrategy {

    @Override
    public Double performCalculation(Double fst, Double snd) {
        if (snd == 0) {
            return null;
        }
        return fst / snd;
    }
}
