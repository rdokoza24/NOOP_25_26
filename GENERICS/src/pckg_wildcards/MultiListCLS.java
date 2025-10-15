package pckg_wildcards;

import java.util.List;

public class MultiListCLS<E> {

    private final List<E> someList;

    public MultiListCLS(List<E> someList) {
        this.someList = someList;
    }

    public void listElementsInList() {
        if (someList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            someList.forEach(System.out::println);
        }
    }

    public void addElement(E element) {
        if (!someList.contains(element)) {
            someList.add(element);
        } else {
            System.out.println("Element already exists in the list");
        }
    }

    public void compareListLengths(List<?> otherList) {
        if (this.someList.size() > otherList.size()) {
            System.out.println("This list is longer than the other list.");
        } else if (this.someList.size() < otherList.size()) {
            System.out.println("This list is shorter than the other list.");
        } else {
            System.out.println("Both lists are of equal length.");
        }
    }
}