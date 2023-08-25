import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Create a new ArrayList which contains Cupcake objects and name it cupcakeMenu.
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // Create a new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();

        // Create a new RedVelvet object named redVelvet
        RedVelvet redVelvet = new RedVelvet();

        // Create a new Chocolate object named chocolate
        Chocolate chocolate = new Chocolate();

        // 1. Print
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu, but we need to decide on pricing.");

        // 2. Create a Scanner named input so we can accept the user's input.
        Scanner input = new Scanner(System.in);

        // 3. Print
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        // 4. Call the method cupcake.type()
        cupcake.type();

        // 5. Print
        System.out.println("How much would you like to charge for the cupcake? \nInput a numerical number take to 2 decimal places.");

        // 6. Create a Str variable named priceText and assign it to the value of input.nextLine().
        String priceText = input.nextLine();

        // 8. Create a double var named price
        double price = Double.parseDouble(priceText);

        // 9. Call the method cupcake.setPrice() with param of price
        cupcake.setPrice(price);

        // 3. Print
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");

        // 4. Call the method cupcake.type()
        redVelvet.type();

        // 5. Print
        System.out.println("How much would you like to charge for the cupcake? \nInput a numerical number take to 2 decimal places.");

        // 6. Create a Str variable named priceText and assign it to the value of input.nextLine().
        priceText = input.nextLine();

        // 8. Create a double var named price
        price = Double.parseDouble(priceText);

        // 9. Call the method cupcake.setPrice() with param of price
        redVelvet.setPrice(price);

        // 3. Print
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");

        // 4. Call the method cupcake.type()
        chocolate.type();

        // 5. Print
        System.out.println("How much would you like to charge for the cupcake? \nInput a numerical number take to 2 decimal places.");

        // 6. Create a Str variable named priceText and assign it to the value of input.nextLine().
        priceText = input.nextLine();

        // 8. Create a double var named price
        price = Double.parseDouble(priceText);

        // 9. Call the method cupcake.setPrice() with param of price
        chocolate.setPrice(price);

        // 11. Add each of these cupcake objects to the cupcakeMenu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

    }
}

class RedVelvet extends Cupcake {

    public void type() {

        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {

    public void type() {

        System.out.println("A chocolate velvet based cupcake, with chocolate frosting");
    }
}

class Drink {

    // Create public double var named price with no initial value
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
