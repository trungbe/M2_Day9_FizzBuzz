public class FizzBuzz {
    public static String translate(int number) {
        String toString = "";
        boolean isFizzBuzz = (number % 3 == 0 && number % 5 == 0);
        boolean isFizz = (number % 3 == 0) || divisible3(number);
        boolean isBuzz = (number % 5 == 0) || divisible5(number);



        if (isFizzBuzz){
            toString = "FizzBuzz";
        } else if (isFizz){
            toString = "Fizz";
        } else  if (isBuzz){
            toString = "Buzz";
        }

        return toString;
    }

    private static boolean divisible3(int number) {
        boolean divisible3 = false;
        if ((number % 10) % 3 == 0) divisible3 = true;
        if ((number / 10) % 3 == 0) divisible3 = true;
        return divisible3;
    }
    private static boolean divisible5(int number) {
        boolean divisible5 = false;
        if ((number % 10) % 5 == 0) divisible5 = true;
        if ((number / 10) % 5 == 0) divisible5 = true;
        return divisible5;
    }
}
