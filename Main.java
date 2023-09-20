// safe money //

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balance = 0;
        int payment = 6000;
        int goal = 1000000;
        int interesRate = 5;
        int years = 42;


        while (years < 59) {
            balance += payment;
            double interest = balance * interesRate / 100;
            balance += interest;
            years++;
        }


        String net = "n";
        String answer;

        do {
            balance += payment;
            double interest = balance * interesRate / 100;
            balance += interest;
            years++;
            System.out.println(years + "  you are want to go to rest? Your balans " + balance);
            Scanner inp = new Scanner(System.in);
            answer = inp.next();
        }

        while (Objects.equals(answer, net));
        System.out.println("Your old " + years + " and your balance " + balance);

    }

}
