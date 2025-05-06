public class Main {
    public static void main(String[] args) {
        int value=3;

        switch (value){
            case 1->System.out.println("Value was 1");
            case 2->
                System.out.println("Value was 2");
            case 3,4,5->{
                System.out.println("Value was a 3 , 4 or 5");
                System.out.println("Actually the value was " + value);
            }
            default->
                System.out.println("Was not 1 or 2");
                }
    }

    public static String getQuarter(String month){
        return switch (month){
            case "January","February","March" -> "1st";
            case "APril","May","June"->"2nd";
            case "July","August","September" -> "3rd";
            case "October", "November" , "December" ->"4th";
            default -> "bad";
                    };

    }}
