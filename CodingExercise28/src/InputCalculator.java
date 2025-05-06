import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage(){

        int sum=0;
        long average=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while(true){

            try{
                String number=scanner.nextLine();
                int enteredNumber=Integer.parseInt(number);
                sum += enteredNumber;
                count++;

            }catch(NumberFormatException num){
                break;
            }

        }
        try{

            double temporalAverage = ((double) sum / count);
        average = Math.round(temporalAverage);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }catch(ArithmeticException math){
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
    }
}
