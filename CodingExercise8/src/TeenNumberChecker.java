public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(13,19,3));
        System.out.println(hasTeen(42,39,23));
        System.out.println(isTeen(14));
        System.out.println(isTeen(22));
    }

    public static boolean hasTeen(int firstAge,int secondAge,int thirdAge){
        if((firstAge >=13) && (firstAge <=19)
                || (secondAge >=13) && (secondAge <=19)
                || (thirdAge >=13) && (thirdAge <=19)){

                  return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        boolean isTeenAge = age>=13 && age<=19? true : false;
        return isTeenAge;}
}
