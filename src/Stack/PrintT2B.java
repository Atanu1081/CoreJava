package Stack;

import java.util.Stack;

public class PrintT2B
{
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // for printing B2T
        stack.stream().forEach(S -> System.out.println(S));

        System.out.println("-------------------------------------------");

        // for printing T2B
        PrintT2B obj = new PrintT2B();
        System.out.print(obj.printT2B(stack));
    }


    public  String printT2B(Stack<Integer> stack)
    {
        String result = "";
        for (int i =stack.size()-1 ; i >= 0; i--) {
            if(stack.get(i) != null ) {
                result = result + stack.get(i) + "\n";

            }
        }

        if( result.equals(null))
        {
            return "empty";
        }
        else {
            return result;
        }
    }
}
