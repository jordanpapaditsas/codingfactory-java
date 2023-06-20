package CodingFactory23A.src.gr.aueb.cf.ch17.runnable;

public class Main {
    public static void main(String[] args) {
        Knight kingArthur = new Knight("King Arthur");
        Knight sirLancelot = new Knight("Sir Lancelot");
        Knight saintGeorge = new Knight("Saint George");

        (new Thread(kingArthur)).start();
        (new Thread(sirLancelot)).start();
        (new Thread(saintGeorge)).start();
    }
}