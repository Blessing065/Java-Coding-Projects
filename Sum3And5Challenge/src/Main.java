public class Main {
    public static void main(String[] args) {

        int sum=0;
        int count = 0;

        for(int i = 10;i<=100;i++){

            if((i % 3 ==0) && (i % 5==0)){
                System.out.println("The number is divisible by both 3 and 5 " + i);
                count++;
                sum+=i;
                if(count == 5){
                    System.out.println("We found 5 numbers that are both divisible by 3 and 5...-Exiting the loop ");
                    break;
                }
            }
        }
        System.out.println("The sum of 5 numbers that are both divisible by 3 and 5 is = "+ sum);
    }
}
