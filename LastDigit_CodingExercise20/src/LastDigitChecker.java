public class LastDigitChecker {

    public static boolean hasSharedLastDigit(int number1,int number2, int number3){

        if((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)){
            return  false;}

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return ((number1LastDigit == number2LastDigit) || (number2LastDigit == number3LastDigit) || (number1LastDigit == number3LastDigit));

    }

    public static boolean isValid(int number){

        if((number < 10 || number > 1000)){return false;}
        else {return true;}
    }
}





/*
Last Digit Checker

Write a method named hasSameLastDigit with three parameters of type int.

Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


EXAMPLE INPUT/OUTPUT:

    hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71

    hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42

    hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000


Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

EXAMPLE INPUT/OUTPUT

    isValid(10); → should return true since 10 is within the range of 10-1000

    isValid(468); → should return true since 468 is within the range of 10-1000

    isValid(1051); → should return false since 1051 is not within the range of 10-1000


NOTE: All methods need to be defined as public static as we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */
