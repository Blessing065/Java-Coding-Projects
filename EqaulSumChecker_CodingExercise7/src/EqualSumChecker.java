public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(0,91,12));

    }

    public static boolean hasEqualSum(int firstNumber,int secondNumber, int thirdNumber){
        int sum = firstNumber + secondNumber;
        if(sum == thirdNumber){
            return true;}
        return false; }
}
