import coffeMachine.InputFunction;
import items.AddItems;

public class Main {
    public static void main(String[] args) {

        InputFunction inputFunction = new InputFunction();
        AddItems items = new AddItems();
        items.add(800,500,1000);
        System.out.println("\nWelcome to Coffee Shop!");
        inputFunction.input();
    }
}