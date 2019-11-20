package Interface;

public class Bird extends Color implements IEatable,IFlyable  {

    public void fly(){
        System.out.println("Bird flying");
    }
    public void eat()
    {
        System.out.println("Bird eats");
    }
}
