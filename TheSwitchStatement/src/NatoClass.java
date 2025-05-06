public class NatoClass {

    public static void main(String[] args) {


        System.out.println("Using the method getNota ");
        getNota('e');
        getNota('C');
        System.out.println("  ");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Using the hand written code ");
        char variable = 'X';

        switch (variable){
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + variable + " Not Found in the switch");
                break;
        }
    }

    public static void getNota(char variable){
        switch (variable){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }
}
