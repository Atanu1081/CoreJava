package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Collection
{
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Maruti");
        cars.add("Volkswogen");
        cars.add("Ferrari");

        Collections.sort(cars);
        System.out.println(cars);



        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(13);
        nums.add(-31);
        nums.add(0);
        nums.add(500);

        Collections.sort(nums);
        System.out.println(nums);





    }
}
