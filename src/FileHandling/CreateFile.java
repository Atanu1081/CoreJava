package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args) {

        try
        {
            File myObj = new File("C:\\Users\\atanu1081\\Desktop\\File.txt");
            if (myObj.createNewFile())
            {
                System.out.println("File created with name = " + myObj.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("Sorry! an unexpected error occurred");
        }
    }
}
