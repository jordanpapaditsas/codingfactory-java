package gr.aueb.cf.ch19;

public class NodeGenericApp {

    public static void main(String[] args) {
         NodeGeneric<Integer> nodeInt = new NodeGeneric<>();
         NodeGeneric<String> nodeStr = new NodeGeneric<>();

         nodeInt.setValue(3);
         nodeStr.setValue("Coding");


    }
}
