import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        System.out.println("Enter 3 numbers: ");

        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        float secondNum = input.nextFloat();
        byte thirdNum = input.nextByte();

        double sum = firstNum + secondNum + thirdNum;

        System.out.println("Sum of all inputs: " + sum);
    }
}


















































