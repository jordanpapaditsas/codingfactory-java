package gr.aueb.cf.ch19;

import java.awt.*;
import java.util.List;

public class GenericMethodApp {

    public static void main(String[] args) {
        Integer[] arrInt = {1, 3, 4};
        printArr(arrInt);

    }

    public static <T> void printArr(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    // Polymorphic
    public static void print(NodeGeneric<? extends Number> node) {
        System.out.println(node.getValue());
    }

    public static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {
        for (T t : src) {
            list.add(t);
        }
    }
}
