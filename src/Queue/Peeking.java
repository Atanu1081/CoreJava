package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Peeking
{
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Jennifer");
        queue.add("Angelina");
        queue.add("Dave");
        queue.add("Sachin");

        queue.stream().forEach(Q -> System.out.println(Q));
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Sachin"));

        String peekedItem = queue.peek();
        System.out.println(peekedItem);

    }
}
