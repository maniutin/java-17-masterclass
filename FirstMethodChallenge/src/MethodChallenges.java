public class MethodChallenges {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);

        return num1Int == num2Int;
    }

}
