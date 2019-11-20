package Exceptions;

public class TryAndCatch
{
    public static void main(String[] args) {
        try {
            int[] intArray = {1,2,3};
            System.out.println(intArray[3]);
        }
        catch (Exception e)
        {
            System.out.println("Number is out of range of this Arrray");
        }
    }
}
