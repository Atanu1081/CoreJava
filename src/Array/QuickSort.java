package Array;

public class QuickSort
{
    public static void main(String[] args)
    {

        int[] arr = {3,5,2,34,547,6754,12,25,36,315};
        int length = arr.length;
        System.out.println(length);

        QuickSort obj = new QuickSort();
        obj.quickSortRecursion(arr, 0, length-1);
        obj.printArray(arr);

    }

    int partition (int[] arr, int low, int high)
    {
        int pivot = arr[(low + high)/2];

        while (low<=high)
        {
            while (arr[low]<pivot)
            {
                low++;
            }

            while (arr[high]>pivot)
            {
                high--;
            }

            if(low<=high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }


        }
        return low;
    }

    void quickSortRecursion (int[] arr, int low, int high)
    {
        int pi = partition(arr, low, high);

        if (low<pi-1)
        {
            quickSortRecursion(arr, low, pi-1);
        }

        if (pi<high)
        {
            quickSortRecursion(arr, pi, high);
        }

    }

    void printArray(int[] arr)
    {
        for (int result : arr)
        {
            System.out.print(result+ " ");
        }
    }
}
