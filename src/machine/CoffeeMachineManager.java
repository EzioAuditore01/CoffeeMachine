package machine;

public class CoffeeMachineManager {

    int water;
    int milk;
    int coffeeBeans;
    int disCups;
    int money;


    public CoffeeMachineManager() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disCups = 9;
        this.money = 550;
    }


    // Printing ingredients depending of cups required
    public static void ingredients(int cups) {
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * 200 + " ml of water");
        System.out.println(cups * 50 + " ml of milk");
        System.out.println(cups * 15 + " g of coffee beans");


    }

    // Checking how much cups of coffee can we make based on machine capacity(inputs)
    public static void ammountChecker(int water, int milk, int beans, int cups) {
        int waterLeft = water - cups * 200;
        int milkLeft = milk - cups * 50;
        int beansLeft = beans - cups * 15;
        int maxCups;
        int maxCupsByWater = water / 200;
        int maxCupsByMilk = milk / 50;
        int maxCupsByBeans = beans / 15;
        maxCups = smallest(maxCupsByWater, maxCupsByMilk, maxCupsByBeans);


        if (waterLeft < 0 || milkLeft < 0 || beansLeft < 0) {

            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        } else if (waterLeft < 200 || milkLeft >= 0 && milkLeft < 50 || beansLeft >= 0 && beansLeft < 15) {

            System.out.println("Yes, I can make that amount of coffee");

        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maxCups - cups) + " more than that)");
        }

    }

    // Smallest of 3 numbers
    public static int smallest(int a, int b, int c) {
        int smallest = a;

        if (a < b && a < c) {
            smallest = a;
        }

        if (b < a && b < c) {
            smallest = b;
        }

        if (c < a && c < b) {
            smallest = c;
        }

        if (a == b && b == c) {

            smallest = a;
        }

        return smallest;

    }

    //Printing the state of coffee machine
    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " ml of water");
        System.out.println(this.milk + " ml of milk");
        System.out.println(this.coffeeBeans + " g of coffee beans");
        System.out.println(this.disCups + " disposable cups");
        System.out.println("$" + this.money + " of money");
    }

    // If the user wants to buy product
    public void buy(int beverageNum) {

        if (beverageNum == 1) {
            if (this.water - 250 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (this.coffeeBeans - 16 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                this.water = this.water - 250;
                this.coffeeBeans = this.coffeeBeans - 16;
                this.money = this.money + 4;
                this.disCups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }

        if (beverageNum == 2) {

            if (this.water - 350 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (this.milk - 75 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (this.coffeeBeans - 20 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                this.water = this.water - 350;
                this.milk = this.milk - 75;
                this.coffeeBeans = this.coffeeBeans - 20;
                this.money = this.money + 7;
                this.disCups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }

        if (beverageNum == 3) {
            if (this.water - 200 < 0) {
                System.out.println("Sorry, not enough water!");
            } else if (this.milk - 100 < 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (this.coffeeBeans - 12 < 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                this.water = this.water - 200;
                this.milk = this.milk - 100;
                this.coffeeBeans = this.coffeeBeans - 12;
                this.money = this.money + 6;
                this.disCups--;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
    }

    //// Filling coffee machine by the worker
    public void fill(int water, int milk, int beans, int cups) {
        this.water = this.water + water;
        this.milk = this.milk + milk;
        this.coffeeBeans = this.coffeeBeans + beans;
        this.disCups += cups;
    }

    //// Taking money from the cash register
    public void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }


}