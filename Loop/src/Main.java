//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            System.out.println("10,000 at " + rate + "% interest = " + String.format("%.2f", calculateInterest(10000.0, rate)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}