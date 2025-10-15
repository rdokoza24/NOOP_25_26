package pckg_interface_parametrization;

public class StringLenghtComparison implements Comparable<StringLenghtComparison>{

    private final String initString;

    public StringLenghtComparison(String initString) {
        this.initString = initString;
    }

    @Override
    public int compareTo(StringLenghtComparison other) {
        return this.initString.length() - other.initString.length();
    }

    @Override
    public String toString() {
        return initString;
    }
}
