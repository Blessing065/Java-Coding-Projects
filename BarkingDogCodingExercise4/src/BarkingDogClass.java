public class BarkingDogClass {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(  shouldWakeUp(false,22));
        System.out.println(shouldWakeUp(true,8)) ;
        System.out.println(shouldWakeUp(true,-1)) ;
        System.out.println(shouldWakeUp(true,23)) ;
    }
    public static boolean shouldWakeUp(boolean isDogBarking , int hourOfDay){

        if((hourOfDay < 0) || (hourOfDay > 23)){
            return false;
        } else if (((hourOfDay < 8 ) || (hourOfDay > 22)) && (isDogBarking)) {
            return true;
        }
        return false;
    }
}
