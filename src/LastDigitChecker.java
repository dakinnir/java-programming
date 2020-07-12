public class LastDigitChecker {
     public static boolean hasSameLastDigit(int number1, int number2, int number3) {
         if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
             return false;
         }
         return (number1%10==number2%10) && (number1%10==number3%10) || (number2%10==number1%10) && (number2%10==number3%10) || (number1%10==number2%10) || (number1%10==number3%10 || (number2%10==number3%10) || (number2%10==number1%10));
     }
     public static boolean isValid(int num) {
         return (num >= 10 && num <= 1000);
     }
}

