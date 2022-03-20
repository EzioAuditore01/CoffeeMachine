package machine;

import java.util.Scanner;

public class UserInterface {
    CoffeeMachineManager cm = new CoffeeMachineManager();
    Scanner scanner = new Scanner(System.in);

    // If the user wants to buy product UI
    public void buy(int input) {
        cm.buy(input);
    }


    // Filling coffee machine by the worker UI
    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int water = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        int milk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cups = Integer.parseInt(scanner.nextLine());
        cm.fill(water, milk, beans, cups);
        System.out.println();

    }

    // Taking money from the cash register UI
    public void take() {
        cm.take();
        System.out.println();
        //cm.printState();
    }

    // Prints current state
    public void printState() {

        cm.printState();
    }
}
