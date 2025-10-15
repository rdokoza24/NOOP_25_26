package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        HashMap<String, Integer> mapa = new HashMap<>();
        TreeMap<Integer, String> mapa2 = new TreeMap<>();

        User<Integer> user = new User<>(10, "Jurica");




        lista.add(345);
        lista.add(2345);
        lista.add(543252345);

        lista2.add("Test");
        lista2.add("Test2");
        lista2.add("Test3");

        mapa.put("Test", 345);
        mapa.put("Test2", 2345);
        mapa.put("Test3", 543252345);

        mapa2.put(2, "Test");
        mapa2.put(3, "Test2");
        mapa2.put(4, "Test3");

        printAnyListElement(lista);
        printAnyListElement(lista2);

        listMapElements(mapa);
        listMapElements(mapa2);


        SimpleUser su = new SimpleUser("Ana");
        AdvancedUser au = new AdvancedUser("Marko");

        UserParam<SimpleUser> p1 = new UserParam<>(su);
        UserParam<AdvancedUser> p2 = new UserParam<>(au);

        p1.processUser();
        p2.processUser();
    }


    private static <E> void printAnyListElement(ArrayList<E> lista) {
        for (E element : lista) {
            System.out.println(element);
        }
    }


    private static <K, V> void listMapElements(Map<K,V> map){
        for (K key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
        }
    }
}
