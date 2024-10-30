import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter number:");
            String nextEntry = scanner.nextLine();

            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}