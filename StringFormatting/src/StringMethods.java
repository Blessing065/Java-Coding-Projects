public class StringMethods {

    public static void main(String[] args) {
        printInformation("Blessing Mashele");
        printInformation("");
        printInformation("        ");

        String first  = "Hello World";
        System.out.printf("First l is = %d %n " ,first.indexOf('l'));
        System.out.printf("Last l is = %d %n " ,first.lastIndexOf('l'));


    }
    public static void printInformation(String string){

        int length = string.length();
        if(string.isEmpty()){
            System.out.println("The string is Empty");
            System.out.printf("The length is = %d %n " ,string.length());

            return;
        }
        else if(string.isBlank()){
            System.out.println("The string is blank");
            System.out.printf("The length is = %d %n " ,string.length());
            return;
        }
        System.out.printf("The length is = %d %n " , length);
        System.out.printf("First Character is = %c %n " , string.charAt(0));
        System.out.printf("The last character is = %c %n " ,string.charAt(string.length() - 1 ));

    }
}
