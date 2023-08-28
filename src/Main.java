import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Create a new ArrayList which contains Cupcake objects and name it cupcakeMenu.
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        // Create a new ArrayList which contains Cupcake objects and name it cupcakeMenu.
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        // Create a new Cupcake object named cupcake
        Cupcake cupcake = new Cupcake();

        // Create a new RedVelvet object named redVelvet
        RedVelvet redVelvet = new RedVelvet();

        // Create a new Chocolate object named chocolate
        Chocolate chocolate = new Chocolate();

        // Create a new Cupcake object named cupcake
        Drink water = new Drink();

        // Create a new RedVelvet object named redVelvet
        Soda soda = new Soda();

        // Create a new Chocolate object named chocolate
        Milk milk = new Milk();



        // 1. Print
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu, but we need to decide on pricing.");

        // 2. Create a Scanner named input, so we can accept the user's input.
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

        // 1. Print "We are in the middle of creating the drink menu. We currently have three types of drinks on
        //    the menu, but we need to decide on pricing"
        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" +
                "\nthe menu, but we need to decide on pricing");

        // 3. Print “We are deciding on the price for our bottled water. Here is the description:”
        System.out.println("We are deciding on the price for our bottled water. Here is the description: ");

        // 4. Call the type() method on the water object to get the description
        water.type();

        // 5. Print "How much would you like to charge for the water bottle?
        System.out.println("How much would you like to charge for the water bottle?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // 6. Create a Str variable named priceText and assign it to the value of input.nextLine().
        priceText = input.nextLine();

        // 8. Create a double var named price
        price = Double.parseDouble(priceText);

        // 9. Call the method water.setPrice() with param of price
        water.setPrice(price);

        //////////// Soda ////////////

        // 3. Print “We are deciding on the price for our soda. Here is the description:”
        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");

        // 4. Call the type() method on the soda object to get the description
        soda.type();

        // 5. Print "How much would you like to charge for the bottled soda?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // 6. Set the String variable named priceText equal to input.nextLine()
        priceText = input.nextLine();

        // 8. Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // 9. Can call the setPrice() method with the parameter of price on the soda object
        soda.setPrice(price);

        //////////////// Milk ////////////////

        // 3. Print "We are deciding on the price for our bottle of milk. Here is the description:"
        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");

        // 4. Call the type() method on the milk object to get the description
        milk.type();

        // 5. Print "How much would you like to charge for the bottled milk?
        //    (Input a numerical number taken to 2 decimal places)"
        System.out.println("How much would you like to charge for the bottled milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        // 6. Set the String variable named priceText equal to input.nextLine()
        priceText = input.nextLine();

        // 8. Set the double variable named price equal to Double.parseDouble(priceText)
        price = Double.parseDouble(priceText);

        // 9. Now that we have the price, we can call the setPrice() method with the parameter of price on the milk object
        milk.setPrice(price);

        // Add items to the drinkMenu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        // Call the Order constructor and pass in cupcakeMenu and drinkMenu as parameters.
        new Order(cupcakeMenu, drinkMenu);
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

    // Create a set price function
    public void setPrice(double price) {
        this.price = price;
    }

    // Create a public function that prints a description and returns void
    public void type() {
        System.out.println("A drink of water.");
    }
}

// Create a Soda class that extends from drink
class Soda extends Drink {

    // Type
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

// Create a Milk class that extends from drink
class Milk extends Drink {

    // Type
    public void type() {
        System.out.println("A bottle of milk.");
    }
}
