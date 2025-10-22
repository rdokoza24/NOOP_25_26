package pckg_DuckPrimjer;

import java.util.List;

public class SimpleSorter<E> extends Sorter<E>{


    protected SimpleSorter(List<E> list, SortPrinciple sortPrinciple) {
        super(list, sortPrinciple);
    }

    @Override
    protected void performSorting() {
        sortPrinciple.sortElements(list);
    }
}
