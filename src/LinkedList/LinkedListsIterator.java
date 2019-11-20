package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsIterator
{
    public static void main(String[] args) {

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (int result : linkedList)
        {
            System.out.print(result+" ");
        }

    }


}
