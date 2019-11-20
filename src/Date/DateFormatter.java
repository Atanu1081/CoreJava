package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter
{
    public static void main(String[] args)
    {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Before formatting  " + dt);

        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-yyyy-MM HH:mm:ss");
        String formattedPattern = dt.format(dtf);
        System.out.println("After formatting  " + formattedPattern);


    }
}
