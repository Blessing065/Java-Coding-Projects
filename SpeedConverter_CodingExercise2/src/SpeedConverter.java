public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println("Miles per hour method");
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(0));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(75.114));
        System.out.println(toMilesPerHour(25.42));

        System.out.println("For Print conversion method");
        printConversion(1.5);
        printConversion(10.25);
        printConversion(0);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);



    }
    //To miles per hour method
    public static long toMilesPerHour(double kilometersPerHour){
        long miles = Math.round((kilometersPerHour / 1.609));
        if(kilometersPerHour < 0){
            return -1; }
        else if(kilometersPerHour > 0){
            return miles;
        }
        return miles;
    }
    //Print conversion method
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else if (kilometersPerHour  >= 0) {

            System.out.println(kilometersPerHour + " km/h = " +
                               toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }


}
