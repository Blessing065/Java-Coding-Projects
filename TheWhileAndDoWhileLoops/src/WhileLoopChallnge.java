public class WhileLoopChallnge {
    public static void main(String[] args) {
//
//        System.out.println(isEvenNumber(2));
//        System.out.println(isEvenNumber(3));
//        System.out.println(isEvenNumber(4));
//        System.out.println(isEvenNumber(5));
//        System.out.println(isEvenNumber(6));

        int number=4;
        int counter=0;
        int counter2=0;
        while(number <= 20){
            number++;
            if(isEvenNumber(number)){
                System.out.println( number + " is even "   );
                counter++;
                if (counter == 5){
                    System.out.println("The total number of even numbers is = " + counter);
                    System.out.println("The total number of odd numbers is = " + counter2);

                    break;
                }

            } else if (!isEvenNumber(number)) {
                System.out.println( number + " is odd "   );
                counter2++;


            }

        }



    }

    public static boolean isEvenNumber(int number){
        return (number % 2 ==0);
    }
}
