package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiList {

    public static void main(String[] args) {
        String someString = "This is a test string";
        String [] partsOfSomeString = someString.split(" ");
        List<String> listString = new ArrayList<String>(Arrays.asList(partsOfSomeString));
        System.out.println(Arrays.toString(partsOfSomeString));
        MultiListCLS<String> stringMultiList = new MultiListCLS<>(listString);
        Integer[] intNums = {23, 25, 10, -10, 55, 34, 0, 4, 1, 2, 3, 4};
        List<Integer> iList = new ArrayList<>(Arrays.asList(intNums));
        stringMultiList.compareListLengths(iList);

    }


}
