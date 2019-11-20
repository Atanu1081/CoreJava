package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public static void main(String[] args) throws IOException {

        try
        {
            FileWriter myObj = new FileWriter("C:\\Users\\atanu1081\\Desktop\\File.txt");

            myObj.write("Hey there, this is a demo file. ");
            myObj.close();

            System.out.println("Successfully written");
        }

        catch (IOException e)
        {
            System.out.println("Sorry! an unexpected error occurred");
        }

    }
}
