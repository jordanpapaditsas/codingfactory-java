package CodingFactory23A.src.gr.aueb.cf.ch17.callback;

public class Main {

    public static void main(String[] args) {
        IKnight sirLancelot = new Knight();
        IKnight kingArthur = new Knight();

        sirLancelot.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the Princess.");
            }
        });

        kingArthur.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });
    }

    public static void killTheDragon() {
        System.out.println("Kill the Dragon.");
    }
}
