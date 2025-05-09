public class DayOfWeekClass {
    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

    public static void printDayOfWeek(int day){

        String daOfWeek = switch (day){
            case 0-> "Sunday";
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + daOfWeek);
    }

    public static void printWeekDay(int day){
        if((day < 0) || (day > 7)){
            System.out.println("Invalid Day");
        } else if (day == 0) {
            System.out.println("Sunday");

        }
        else if (day == 1) {
            System.out.println("Monday");

        }else if (day == 2) {
            System.out.println("Tuesday");

        }else if (day == 3) {
            System.out.println("Wednesday");

        }else if (day == 4) {
            System.out.println("Thursday");

        }else if (day == 5) {
            System.out.println("Friday");

        }else if (day == 6) {
            System.out.println("Saturday");
        }
    }

}
