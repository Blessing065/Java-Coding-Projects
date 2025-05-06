public class Main {
    public static void main(String[] args) {

        System.out.println("1 is " + (isPrime(1)?"" : " NOT") + " a prime number");
        System.out.println("8 is " + (isPrime(8)?"" : " NOT" ) + " a prime number");
        System.out.println("17 is " + (isPrime(17)?"" : " NOT") + " a prime number");
        System.out.println("13 is " + (isPrime(13)? "" : " NOT") + " a prime number");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Challenge solution");


        int counter = 0;

        for(int number = 5 ; number <= 1000; number ++){

            if(isPrime(number)){
                System.out.println("The number " + number + " is a prime number");
                counter++;

                if(counter==3){
                    break;
                }
            }
        }



         }


    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <=2){
            return (wholeNumber == 2);
        }

        for(int divisor=2;divisor < wholeNumber ;divisor++){
            if(wholeNumber % divisor ==0){
                return false;

            }
        }
        return true;
    }
}
