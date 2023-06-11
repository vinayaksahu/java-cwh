import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int firstNum = input.nextInt();
        float secondNum = input.nextFloat();
        byte thirdNum = input.nextByte();

        double sum = firstNum + secondNum + thirdNum;

        System.out.println("Sum of all inputs: " + sum);

        //check input value integer or not
        System.out.println("Checking input key is integer or not :" + input.hasNextInt());
        /*boolean isInteger = input.hasNextInt();
        System.out.println("Checking input key is integer or not :" + isInteger);*/
    }
}


















































