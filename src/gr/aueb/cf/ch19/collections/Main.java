package CodingFactory23A.src.gr.aueb.cf.ch19.collections;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Paris", "Tokyo", "Kyoto");
        Iterator<String> it = cities.iterator();

        for (int i = 0; i < cities.size(); i++) {       // normal for  traverse
            System.out.println(cities.get(i));
        }

        for (String s : cities) {
            System.out.println(s + " ");            // enhanced for  with iterator
        }

        while (it.hasNext()) {
            String s = it.next();                   // while
            System.out.println(s);
        }

        cities.forEach(System.out::println);        // forEach  with iterator
    }
}
