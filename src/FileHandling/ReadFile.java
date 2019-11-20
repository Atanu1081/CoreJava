package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
    public static void main(String[] args) throws FileNotFoundException {

        try
        {
            File myObj = new File("C:\\Users\\atanu1081\\Desktop\\File.txt");

            Scanner sc = new Scanner(myObj);

            while (sc.hasNextLine())
            {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Sorry! an unexpected error occurred");
        }




    }
}
