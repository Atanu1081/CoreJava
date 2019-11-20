package FileHandling;

import java.io.File;

public class GetInfo
{
    public static void main(String[] args) {

        File myObj = new File("C:\\Users\\atanu1081\\Desktop\\File.txt");
        if (myObj.exists())
        {
            System.out.println(myObj.getName());
            System.out.println(myObj.canRead());
            System.out.println(myObj.canWrite());
            System.out.println(myObj.canExecute());
            System.out.println(myObj.length());
            System.out.println(myObj.getAbsolutePath());
        }

        else
        {
            System.out.println("File doesn't exists ");
        }
    }
}
