package Array;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        int item = 15;
        int temp=0;

        for (int i=0; i<arr.length; i++)
        {

            if (arr[i]==item)
            {
                System.out.println("Item found");
                temp++;
                break;

            }

        }
        if (temp==0)
        {
            System.out.println("Item not found");
        }


    }
}
