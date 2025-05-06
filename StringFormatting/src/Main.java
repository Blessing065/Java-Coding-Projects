public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: \n" +
              "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point
                """;

        System.out.println(textBlock);

        int age=35;
        System.out.printf("Your age is %d\n" ,age);

        int birthYear = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d %n" , age , birthYear);

        for(int i=1;i<=20000000;i*=20){
            System.out.printf("Print number = %6d%n ",i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        System.out.println("length ="+formattedString.length());
        System.out.println("CharAT ="+formattedString.charAt(4));
        System.out.println("CharAT ="+formattedString.charAt(5));
        System.out.println("LastIndexOf ="+formattedString.lastIndexOf('s'));
        System.out.println("IndexOf ="+formattedString.indexOf('i'));
    }
}
