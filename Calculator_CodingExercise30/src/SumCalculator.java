public class SumCalculator {

    public static void main(String[] args) {

        simpleCalculator firstCalculator = new simpleCalculator();
        firstCalculator.setFirstNumber(8);
        firstCalculator.setSecondNumber(4);
        System.out.println("The first number =" + firstCalculator.getFirstNumber() );
        System.out.println("The second number =" + firstCalculator.getSecondNumber());
        System.out.println("Addition between the 2 numbers =" + firstCalculator.getAdditionResult());
        System.out.println("Subtraction between the 2 numbers =" + firstCalculator.getSubtractionResult());
        System.out.println("Multiplication between the 2 numbers =" + firstCalculator.getMultiplicationResult());
        System.out.println("Division between the 2 numbers =" + firstCalculator.getDivisionResult());


    }
}
