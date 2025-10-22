package pckg_VJ_1_ZD1B;

public class AdditionStrategy implements CalculationStrategy{

    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst + snd;
    }
}
