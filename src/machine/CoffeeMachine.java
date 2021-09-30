package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CoffeeMachineManager cm = new CoffeeMachineManager();
        UserInterface ui = new UserInterface();

        // Program logic
        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String input = scanner.nextLine();

            if (input.equals("buy")) {
                System.out.println();
                System.out.print("What do you want to buy?");
                System.out.println(" 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu:");
                String inputx = (scanner.nextLine());

                try {
                    ui.buy(Integer.parseInt(inputx));
                    System.out.println();
                } catch (Exception e) {
                    System.out.println();
                    continue;
                }
            }


            if (input.equals("fill")) {
                System.out.println();
                ui.fill();
                System.out.println();
                continue;
            }
            if (input.equals("take")) {
                ui.take();
                System.out.println();
                continue;
            }

            if (input.equals("remaining")) {
                System.out.println();
                ui.printState();
                System.out.println();
                continue;
            }

            if (input.equals("exit")) {
                break;
            }
        }

    }


}
