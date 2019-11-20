package Array;

public class BinarySearch
{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        int item = 15;

        int li = 0;
        int hi = arr.length-1;
        int mi = (li + hi)/2;

        while (li<=hi)
        {
            if (arr[mi]==item)
            {
                System.out.println("Item is at " + mi + " index position ");
                break;
            }
            else if (arr[mi]<item)
            {
                li = mi + 1;
            }
            else
            {
                hi = mi - 1;
            }
            mi = (li + hi)/2;
        }

        if (li>hi)
        {
            System.out.println(" Item not found ");
        }


    }
}
