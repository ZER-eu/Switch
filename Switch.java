import java.util.Scanner;
public class Enhanced_Switch
{
    static public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Enhanced switch = A replacement to many else if statements
        //                (Java14 feature)


        System.out.print("Enter the day of the Week: ");
        String day = scanner.nextLine();

        switch(day)
        {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("Is is a Weekday");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend");
            default ->
                    System.out.printf("%s <- your current Word is not a day!", day);
        }



        scanner.close();
    }
}
