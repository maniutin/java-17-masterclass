//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int value = 4;

        switch (value) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.print("Value is 3, 4 or 5");
                System.out.println(" Actually it was " + value);
            }
            default -> System.out.println("Value is not 1, 2 or 3");
        }

        System.out.println(getQuarter(1));
        System.out.println(getNatoLetter('F'));
        System.out.println(printDayOfTheWeek(1));
    }

    public static String getQuarter(int month) {
        return switch (month) {
            case 1, 2, 3 -> "First quarter";
            case 4, 5, 6 -> "Second quarter";
            case 7, 8, 9 -> "Third quarter";
            case 10, 11, 12 -> "Fourth quarter";
            default -> {
                yield "Unknown quarter";
            }
        };
    }

    public static String getNatoLetter(char letter) {
        return switch (letter) {
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            case 'F' -> "Foxtrot";
            case 'G' -> "Golf";
            case 'H' -> "Hotel";
            case 'I' -> "India";
            case 'J' -> "Juliet";
            case 'K' -> "Kilo";
            case 'L' -> "Lima";
            case 'M' -> "Mike";
            case 'N' -> "November";
            case 'O' -> "Oscar";
            case 'P' -> "Papa";
            case 'Q' -> "Quebec";
            case 'R' -> "Romeo";
            case 'S' -> "Sierra";
            case 'T' -> "Tango";
            case 'U' -> "Uniform";
            case 'V' -> "Victor";
            case 'W' -> "Whiskey";
            case 'X' -> "X-ray";
            case 'Y' -> "Yankee";
            case 'Z' -> "Zulu";
            default -> "Unknown";
        };
    }

    public static String printDayOfTheWeek(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }
}
