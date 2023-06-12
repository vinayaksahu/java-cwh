import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.print("Entered value is integer: " + input.hasNextInt());

        boolean integerOrNot = input.hasNextInt();
        System.out.println("Entered value is integer: " + integerOrNot);
    }
}
