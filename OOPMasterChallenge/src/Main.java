//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item coke = new Item("drink", "coke" , 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado =  new Item ("Topping", "avocado" , 1.50);
        avocado.printItem();
        }
    }
