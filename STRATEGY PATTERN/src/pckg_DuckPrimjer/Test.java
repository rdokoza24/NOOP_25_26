package pckg_DuckPrimjer;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = List.of("Banana", "Apple", "Orange");
        SimpleSorter<String> sorter = new SimpleSorter<>(list, new SortPrinciple_1());
        sorter.performSorting();
        sorter.setSortPrinciple(new SortPrinciple_2());


    }
}
