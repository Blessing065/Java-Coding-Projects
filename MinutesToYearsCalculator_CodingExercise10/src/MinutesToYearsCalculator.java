public class MinutesToYearsCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
       printYearsAndDays(1051200);
       printYearsAndDays(561600);
        printYearsAndDays(0);

        printYearsAndDays(60);
        printYearsAndDays(-233);
        printYearsAndDays(1440);
        printYearsAndDays(1440);
        System.out.println("For 1440 minuues");
        printYearsAndDays(1440);




    }


    public static void printYearsAndDays(long minutes){

        long hours =(minutes / 60);
        long days = 0;
        long years = 0;
        long remainingDays= 0 ;

        if(minutes < 0){
            System.out.println("Invalid Value");
        }else if(hours==24){
            days=1;
            System.out.println(minutes + " min = " + years + " y and " + days +" d");
        }
        else if(hours >= 24){
            days = (hours / 24);
            if(days >= 365){
                years = (days / 365);
                remainingDays = days % 365;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays +" d" );
            }
        }else {

            System.out.println(minutes + " min = " + years + " y and " + days +" d" );
        }

    }
}


/*Minutes To Years and Days Calculator

1.Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

If the parameter is less than 0, print text "Invalid Value".

Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.


EXAMPLES OF INPUT/OUTPUT:

    printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"

    printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"

    printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"


TIPS:

    Be extra careful about spaces in the printed message.

    Use the remainder operator

    1 hour = 60 minutes

    1 day = 24 hours

    1 year = 365 days

NOTES

    The printYearsAndDays method needs to be defined as public static ​like we have been doing so far in the course.

    Do not add main method to solution code.

    The solution will not be accepted if there are extra spaces.*/
