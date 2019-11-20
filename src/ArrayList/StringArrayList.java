package ArrayList;

import Array.StringArray;

import java.util.ArrayList;

public class StringArrayList
{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Maruti");
        cars.add("Volkswogen");
        cars.add("Ferrari");

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(3));

        cars.set(3, "Jaguar");

        System.out.println(cars.get(3));

        cars.remove(3);
        System.out.println(cars.get(3));

        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());

        for (String car : cars)
        {
            System.out.print(car + " ");
        }
    }
}
