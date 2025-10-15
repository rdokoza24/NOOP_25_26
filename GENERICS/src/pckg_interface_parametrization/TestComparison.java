package pckg_interface_parametrization;

public class TestComparison {

    public static void main(String[] args) {

        String sFst = "tttttt";
        String sSnd = "a";


        StringLenghtComparison fst = new StringLenghtComparison(sFst);
        StringLenghtComparison snd = new StringLenghtComparison(sSnd);
        CompareTWO<StringLenghtComparison> stringLengthCompare = new CompareTWO<>(fst, snd);
        stringLengthCompare.performComparison();
    }
}
