public class SumFirstAndLast {
    public static void main(String[] arguments) {
        System.out.println(sumFirstAndLastDigit(10119));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number+lastDigit;
    }
}
