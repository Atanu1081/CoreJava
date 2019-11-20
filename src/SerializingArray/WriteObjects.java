package SerializingArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects
{
    public static void main(String[] args) {

        System.out.println("Writing objects...");

        Person[] people = {new Person(1,"Atanu"), new Person(2,"Adam"), new Person(3,"Ashok")};
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try(FileOutputStream fs = new FileOutputStream("people.bin"))
        {
            ObjectOutputStream os = new ObjectOutputStream(fs);


            os.writeObject(people);
            os.writeObject(peopleList);

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
