public class ReverseInteger {
    public static void main(String[] arguments) {
        System.out.println("The reversed number: " + reverseInteger(123));
    }

    public static int reverseInteger(int number) {
        if (number<0) {
            return -1;
        }
        int reverseNum = 0;

        while (number>0) {
            reverseNum = reverseNum * 10 + number % 10;
            // this will return the value extracting the last digit of the number
            number = number / 10;
        }
        return reverseNum;
    }
}
