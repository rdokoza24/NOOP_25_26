package pckg_interface_parametrization;

public class CompareTWO <T extends Comparable<T> > {

    private final T first;
    private final T second;

    public CompareTWO(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void performComparison(){
        if(first.compareTo(second) > 0){
            System.out.println(first + " is greater than " + second);
        } else if (first.compareTo(second) < 0){
            System.out.println(first + " is less than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }

}
