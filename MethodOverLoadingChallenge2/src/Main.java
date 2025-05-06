public class Main {
    public static void main(String[] args) {


        System.out.println( getDurationString(160,45));
        System.out.println( getDurationString(65,45));
        System.out.println( getDurationString(-160,45));
                        System.out.println( getDurationString(1560));
        System.out.println( getDurationString(3945));


    }


    public static String  getDurationString(int seconds){


        String returnedString =  getDurationString(seconds / 60 , seconds % 60);

        if((seconds>=0)){

           return returnedString;
        }

        return "Invalid Time Values";
    }

    public static String  getDurationString(int minutes,int seconds){

        int hours = 0 ;
        int remainingMinutes;

        //Minutes to Hours conversion

        if(minutes >= 60){
            hours =(minutes) /60;
            remainingMinutes = (minutes) %60;
        }else {
          remainingMinutes = minutes;
        }

         //Returning the String

        if((minutes >=0) && ((seconds >=0) && (seconds <=59))){

            return hours +"h " + remainingMinutes + "m " + seconds + "s";
        }

        return "Invalid Time Values";
    }

}
