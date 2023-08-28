import java.io.File;
import java.io.IOException;

public class CreateFile {

    public CreateFile() {
        // Create a try catch block, with a catch parameter of IOException e.
        try {
            // In the try block, create a File object named salesData and set it equal to a new File object with the name “salesData.txt”.
            File salesData = new File("salesData.txt");

            // Create an if statement with the parameter salesData.createNewFile(). .createNewFile() will return true if a new file is created.
            // If a new file is created successfully, print “File created: “ and the name of the file. Otherwise, print “File already exists”.
            if (salesData.createNewFile())
            {
                System.out.println("File created: " + salesData.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");

        }
    }

}
