import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        minAndMaxNumber();
    }

    public static void minAndMaxNumber(){
        int min=0;
        int max=0;


        Scanner scanner = new Scanner(System.in);
        do{
        try{
            System.out.print("Enter a number = ");
            String numbers=scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers);

            if(firstNumber < 0){
                continue;
            }else if(firstNumber >=0){
                min=firstNumber;
                max=firstNumber;
                break;
            }

        }catch(NumberFormatException valid){
            System.out.println("Enter a valid number");
        }}while(true);


         while(true){

             try{System.out.print("Enter a number or a character to exit the program ");
             String otherNumbers=scanner.nextLine();
             int newNumbers= Integer.parseInt(otherNumbers);
            if(newNumbers<0){continue;}
             if(newNumbers < min){
                 min=newNumbers;
             }
             else if(newNumbers>min){
                 max=newNumbers;
             }}
             catch (NumberFormatException number){

                 break;
             }
         }
        System.out.println("The Minimum number entered = " + min);
         System.out.println("The Maximum number entered = " + max);

    }

}
