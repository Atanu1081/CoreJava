package Date;

import java.time.LocalTime;

public class CurrentTime
{
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

    }
}
