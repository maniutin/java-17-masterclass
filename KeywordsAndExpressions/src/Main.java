//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
            highScore += 1000;
        }

        int health = 100;

        if((health < 25) && (highScore > 100)) {
            highScore -= 1000;
        }
    }
}