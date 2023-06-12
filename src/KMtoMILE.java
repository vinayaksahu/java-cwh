import java.util.Scanner;
public class KMtoMILE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance to convert (km): ");

        float km = input.nextFloat();

        float mile = km * 0.62f;

        System.out.println(mile + " Miles");
    }
}
