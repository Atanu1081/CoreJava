package Queue;


import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("John");
        queue.add("Dave");
        queue.add("Dan");
        queue.add("Adam");
        queue.add("Ben");

        queue.stream().forEach(S -> System.out.println(S));

        String str1 = queue.remove();
        System.out.println("Removed element is : " + str1);

        queue.stream().forEach(S -> System.out.println(S));

    }
}
