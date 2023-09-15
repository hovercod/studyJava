import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // example While

        double balance = 2;
        double goal = 10;
        double payment = 1;
        double interestRate = 5;
        int years = 20;

        while (balance < goal)
        {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("old = " + years + ", balance = " + balance);

        //  example Do While

        double balanceDo = 2;
        double goalDo = 10;
        double paymentDo = 1;
        double interestRateDo = 5;
        int yearsDo = 20;

        do
        {
            balanceDo += paymentDo;
            double interestDo = balanceDo * interestRateDo / 100;
            balanceDo += interestDo;
            yearsDo++;
        }
        while (balanceDo < goalDo);
        System.out.println("old = " + yearsDo + ", balance = " + balanceDo);

        // example While


        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you " + "need to retire?");
        double goalExample = in.nextDouble();

        System.out.println("How much money will you " + "contribute every year?");
        double paymentExample = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRateExample = in.nextDouble();

        double balanceExample = 0;
        int yearsExample = 0;

        while (balanceExample < goalExample)
        {
            balanceExample += paymentExample;
            double interestExample = balance * interestRate / 100;
            balanceExample += interestExample;
            yearsExample ++;
        }

        System.out.println("You can retire in " + yearsExample + " years");

        Scanner inExam = new Scanner(System.in);
        System.out.println("How much money will you contribute every year?");
        double paymentExam = inExam.nextDouble();

        System.out.println("Interest rate in%:");
        double interestRateExam = inExam.nextDouble();

        double balanceExam = 0;
        int yearExam = 0;
        int input;

        do
        {
            balanceExam += paymentExam;
            double interestExam = balanceExam * interestRateExam / 100;
            balanceExam += interestExam;

            yearExam ++;

            System.out.printf("After year %d, your balance is %,.2f%n", yearExam, balance);
            System.out.println("Ready to retire? (Y=1/N=2)");
            input = inExam.nextInt();
        }
        while (input == 2);

    }

}