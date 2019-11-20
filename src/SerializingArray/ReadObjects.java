package SerializingArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects
{
    public static void main(String[] args) {

        System.out.println("Reading objects...");

        try(FileInputStream fi = new FileInputStream("people.bin"))
        {
            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] people = (Person[]) os.readObject();
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for (Person person : people)
            {
                System.out.println(person);
            }

            for (Person person : peopleList)
            {
                System.out.println(person);
            }


            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
