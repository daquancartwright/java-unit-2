import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;

// Create a class named WriteToFile
class WriteToFile
{
    // Create a public constructor function named WriteToFunction(), with ArrayList<Object> order as the parameter
    public WriteToFile(ArrayList<Object> order)
    {
        // Create a try catch block, with a catch parameter of IOException e
        try
        {
            // Create a new FileWriter object named fw, and set it equal to new FileWriter whose constructor
            // parameters are the name of the object "salesData.txt", and the boolean true, which is an option that
            // allows for appending to the file
            FileWriter fw = new FileWriter("salesData.txt", true);

            // Create a new PrintWriter object named salesWriter, and set it equal to new PrintWriter object whose
            // constructor parameter is the FileWriter object fw created previously.
            PrintWriter salesWriter = new PrintWriter(fw);

            // Print each value in order.
            for (int i = 0; i < order.size(); i++) {
                salesWriter.println(order.get(i));
            }

            // Stop the writer from continuing to run
            salesWriter.close();

            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
        }
    }
}
