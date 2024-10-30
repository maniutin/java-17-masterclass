//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int primeCounter = 0;

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCounter++;
                if (primeCounter == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 1) {
            return false;
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}