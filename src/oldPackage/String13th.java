package oldPackage;

import java.util.Scanner;
public class String13th {
    public static void main(String[] args) {

        //String name1 = "Vinayak";
        String name1;
        name1 = "Vinayak";
        System.out.println(name1);

        String name2 = new String("Sahu");
        System.out.println(name2);

        Scanner input = new Scanner(System.in);
        //String name3 = input.next();
        String name3 = input.nextLine();
        System.out.println(name3);
    }
}
