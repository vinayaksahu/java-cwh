import java.util.Scanner;

public class ConditionalPractice19th {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // #1: what will be the output
        System.out.print("Enter age: ");
        int a = input.nextInt();
        if (a == 11)
            System.out.println("I am 11.");
        else
            System.out.println("I am " + a);

        // #2: whether student is pass or fail
        System.out.println("Enter marks: ");
        byte m1 = input.nextByte();
        byte m2 = input.nextByte();
        byte m3 = input.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // #3: calculate income tax
        System.out.println("Enter your income: ");
        float income = input.nextFloat();
        float tax = 0.0f;

        if (income <= 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5.0f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 3.0f);
        }
        System.out.println("Tax you have to pay: " + tax);

        // #4: Find out the day of week given number
        System.out.println("Enter any week day number: ");
        byte week = input.nextByte();

        switch (week) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid week number");
        }

        // #5: Leap year
        System.out.print("Enter any year: ");
        int year = input.nextInt();
        if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");

        input.close();

        // #6: Type of website type identifier
        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter website: ");
        String website = inputString.nextLine();

        if (website.endsWith(".com"))
            System.out.println("Commercial website");
        else if (website.endsWith(".org"))
            System.out.println("Organization website");
        else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        }

        inputString.close();
    }

}