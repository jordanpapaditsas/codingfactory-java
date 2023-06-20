package CodingFactory23A.src.gr.aueb.cf.ch17.cloneable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        try {
            City athensClone = (City) athens.clone();
            athensClone.setName("Paris");

            System.out.println(athens);
            System.out.println(athensClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
