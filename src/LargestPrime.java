public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int count = 2;
        while (number>1) {
            if (number%count==0) {
                number /= count;
            } else count++;
        } return count;
    }
}
