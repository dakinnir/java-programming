public class TestPracticeForAll {
    public static void main(String[] arguments) {
        System.out.println(isPalindrome(121));
        System.out.println(sumFirstAndLastDigit(922));
        System.out.println(getEvenDigitSum(89042));
        System.out.println(getGreatestCommonDivisor(75,45));
        printFactors(10);
        System.out.println(isPerfectNumber(33550336));
        numberToWords(12);
        System.out.println(reverse(9));
    }

    public static boolean isPalindrome(int number) {
        int originalNum = number;
        int revNum = 0;
        while (number > 0) {
            revNum = revNum * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(revNum);
        return (revNum == originalNum);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 1) {
            return -1;
        }
        int lastNum = (number % 10);
        while (number >= 10) {
            number /= 10;
        } return lastNum + number;
    }


    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sumEven = 0;
        while (number >= 1) {
            if (number % 2 == 0) {
                sumEven += number % 10;
            } number /=10;
        }return sumEven;
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        return (number1%10 == number2%10 || number1%10==number2/10 || number2%10 == number1%10 || number2%10==number1/10 || number1/10 == number2/10);
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
            return false;
        }

        return (number1%10 == number2%10 || number2%10 == number3%10 || number3%10 == number1%10);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 0;
        for (int i=1; i<Math.max(first, second)/2; i++) {
            if (first%i==0 && second%i==0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i=1; i<number+1; i++) {
            if (number%i==0) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i=1; i<number; i++) {
            if (number%i==0) sum += i;
        } return (sum == number);
    }


    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int revNumber = reverse(number);
        int digitCount = getDigitCount(number);
        while (revNumber!=0||digitCount>0) {
            switch (revNumber%10) {
                case 0:
                    System.out.print("Zero ");break;
                case 1:
                    System.out.print("One ");break;
                case 2:
                    System.out.print("Two ");break;
                case 3:
                    System.out.print("Three ");break;
                case 4:
                    System.out.print("Four ");break;
                case 5:
                    System.out.print("Five ");break;
                case 6:
                    System.out.print("Six ");break;
                case 7:
                    System.out.print("Seven ");break;
                case 8:
                    System.out.print("Eight ");break;
                case 9:
                    System.out.print("Nine ");break;
                default: break;
            }
            revNumber /= 10;
            digitCount--;
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number){
        if(number<0) return -1;
        if(number == 0) return 1;

        int count = 0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }
}
