package Array;

public class MultidimensionalArray
{
    public static void main(String[] args) {
        int[][] multiArray = {
                {1,2,3},
                {4,6,9,12},
                {23,0}
        };

        for (int i=0; i<multiArray.length; i++)
        {
            for (int j=0; j<multiArray[i].length; j++)
            {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
