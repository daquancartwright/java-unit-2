import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    // In this file, create a public constructor function named Order with the following parameters: an ArrayList of Cupcake objects named cupcakeMenu, and an ArrayList of Drink objects named drinkMenu.
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

        System.out.println("Hello customer. Would you like to place an order? (Y or N).");

        // Create a Scanner object to accept the users input,
        Scanner input = new Scanner(System.in);

        // Assign the input to a String variable named placeOrder.
        String placeOrder = input.nextLine();

        // Create an Arraylist of Objects and name it order. Note: we are creating an ArrayList of Objects so any objects can be added to the ArrayList - they do not have to all be the same type.
        ArrayList<Object> order = new ArrayList<Object>();

        // Set up a conditional statement
        // Checks if placeOrder equals Y ignoring capitalization. Leave the inside of the block blank for now.
        // In the else block, print “Have a nice day then.”
        if (placeOrder.equalsIgnoreCase("Y")) {

        } else {
            System.out.println("Have a nice day then");
        }

        /////////////////////////// 3. Inside the If Statement //////////////////////////////////

        // Add LocalDate.now() to order
        order.add(LocalDate.now());

        //Add LocalTime.now() to order
        order.add(LocalTime.now());

        //Print "Here is the menu"
        System.out.println("Here is the menu");

        //Print "CUPCAKES:"
        System.out.println("CUPCAKES:");

        //Create an int variable named itemNumber and set it equal to 0
        int itemNumber = 0;

        // Create a for loop that iterates through each index of cupcakeMenu
        for (int i = 0; i < cupcakeMenu.size(); i++)
        {
            // Increment itemNumber by one
            itemNumber++;

            // Print itemNumber.
            System.out.print(itemNumber + ".");

            // Print a description of the cupcake at cupcakeMenu at index i
            cupcakeMenu.get(i).type();

            System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

            // Print a new line
            System.out.println();
        }

        System.out.println("DRINKS:");

        // Create a for loop that iterates through each index of drinkMenu
        for (int i = 0; i < drinkMenu.size(); i++)
        {
            // increment itemNumber by one
            itemNumber++;

            System.out.print(itemNumber + ".");

            // Print a description of the drink at drinkMenu at index i
            drinkMenu.get(i).type();

            System.out.println("Price: $" + drinkMenu.get(i).getPrice());

            // Print a new line
            System.out.println();
        }



        /////////////////////////// 4. Place Order //////////////////////////////////


        // Create a boolean variable named ordering and set it equal to true
        boolean ordering = true;

        // Create a while loop that continues as long as ordering equals true
        while (ordering)
        {
            // Print "What would you like to order? Please use the number associated with each item to order"
            System.out.println("What would you like to order? Please use the number associated with each item to order");

            // Create an int named orderChoice and set it equal to what the user inputs
            int orderChoice = input.nextInt();

            // Correct the terminal scanner input location
            input.nextLine();

            // Create an if statement that checks if orderChoice equals 1
            if (orderChoice == 1)
            {
                // Add the first item from the cupcakeMenu array to the order array
                order.add(cupcakeMenu.get(0));

                System.out.println("Item added to order");
            }
            // Create an else if statement that checks if orderChoice equals 2
            else if (orderChoice == 2)
            {
                // Add the second item from the cupcakeMenu array to the order array
                order.add(cupcakeMenu.get(1));

                System.out.println("Item added to order");
            }
            // Create an else if statement that checks if orderChoice equals 3
            else if (orderChoice == 3)
            {
                // Add the third item from the cupcakeMenu array to the order array
                order.add(cupcakeMenu.get(2));

                System.out.println("Item added to order");
            }
            // Create an else if statement that checks if orderChoice equals 4
            else if (orderChoice == 4)
            {
                // Add the first item from the drinkMenu array to the order array
                order.add(drinkMenu.get(0));

                System.out.println("Item added to order");
            }
            // Create an else if statement that checks if orderChoice equals 5
            else if (orderChoice == 5)
            {
                // Add the second item from the drinkMenu array to the order array
                order.add(drinkMenu.get(1));

                System.out.println("Item added to order");
            }
            // Create an else if statement that checks if orderChoice equals 6
            else if (orderChoice == 6)
            {
                // Add the third item from the drinkMenu array to the order array
                order.add(drinkMenu.get(2));

                System.out.println("Item added to order");
            }
            // Create an else statement with no parameters
            else
            {
                System.out.println("Sorry, we don't seem to have that on the menu");
            }

            //Print "Would you like to continue ordering? (Y/N)"
            System.out.println("Would you like to continue ordering? (Y/N)");

            //Create a String object named continueOrder and set it equal to the user iput
            String continueOrder = input.nextLine();

            //Create an if statement that checks if continueOrder does NOT equal Y ignoring capitalization
            if (!continueOrder.equalsIgnoreCase("Y"))
            {
                // Set ordering equal to false
                ordering = false;
            }
        }

        // Print the first item in the order ArrayList - the date
        System.out.println(order.get(0));

        //Print the second item in the order ArrayList - the time
        System.out.println(order.get(1));

        // Create a double variable named subtotal and set it to 0.0;
        Double subTotal = 0.0;

        // Create a for loop that starts at i = 2 and continues incrementing by 1, while i is less than order.size
        for (int i = 2; i < order.size(); i++)
        {
            // Check if order at i is equal to cupcakeMenu at 0
            if (order.get(i).equals(cupcakeMenu.get(0)))
            {
                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(0).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(0).getPrice();
            }
            // Check if order at i is equal to cupcakeMenu at 1
            else if (order.get(i).equals(cupcakeMenu.get(1)))
            {
                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(1).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(1).getPrice();
            }
            //check if order at i is equal to cupcakeMenu at 2
            else if (order.get(i).equals(cupcakeMenu.get(2)))
            {
                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(2).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(2).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 0
            else if (order.get(i).equals(drinkMenu.get(0)))
            {
                // Print the type of drink at drinkMenu index 0
                drinkMenu.get(0).type();

                // Print the price of drink at drinkMenu index 0
                System.out.println(drinkMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                subTotal = subTotal + drinkMenu.get(0).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 1
            else if (order.get(i).equals(drinkMenu.get(1)))
            {
                // Print the type of drink at drinkMenu index 1
                drinkMenu.get(1).type();

                // Print the price of drink at drinkMenu index 0
                System.out.println(drinkMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                subTotal = subTotal + drinkMenu.get(1).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 2
            else if (order.get(i).equals(drinkMenu.get(2)))
            {
                // Print the type of drink at drinkMenu index 2
                drinkMenu.get(2).type();

                // Print the price of drink at drinkMenu index 2
                System.out.println(drinkMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 2
                subTotal = subTotal + drinkMenu.get(2).getPrice();
            }
        }
        // Print subtotal
        System.out.println("$" + subTotal + "\n");

        // Create a new CreateFile()
        new CreateFile();
        // Create a new WriteToFile() with the parameter order
        new WriteToFile(order);


        
    }
}
