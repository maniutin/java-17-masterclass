public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(6));
        System.out.println(convertToCentimeters(6, 0));
    }

    public static double convertToCentimeters(int height) {
        if (height < 0) {
            return -1;
        }

        return height * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }

        return convertToCentimeters(feet * 12 + inches);
    }
}
