import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 subjects marks: ");
        float sub1 = input.nextFloat();
        float sub2 = input.nextFloat();
        float sub3 = input.nextFloat();
        float sub4 = input.nextFloat();
        int sub5 = input.nextInt();

        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.println("Percentage: " + percentage);
    }
}