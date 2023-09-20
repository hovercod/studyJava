import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Select 1,2,3,4");
        int choise = in.nextInt();

        switch (choise)
        {
            case 1:
                System.out.println("111");
                break;
            case 2:
                System.out.println("222");
                break;
            case 3:
                System.out.println("333");
                break;
            case 4:
                System.out.println("444");
                break;
            default:
                System.out.println("error!!!");
                break;
        }

        Scanner world = new Scanner(System.in);
        System.out.println("write yes or no");
        String input = world.next();

        switch (input.toLowerCase())
        {
            case "yes":
                System.out.println("Yes you win");
                break;
            case "no":
                System.out.println("No try again");
                break;
            default:
                System.out.println("error");
                break;
        }

    }
}