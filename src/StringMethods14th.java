import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class StringMethods14th {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name.length()); //length

        System.out.println(name.toLowerCase()); //upper case

        System.out.println(name.toUpperCase()); //lower case

        System.out.println(name.trim()); //trim

        System.out.println(name.substring(3)); //substring
        System.out.println(name.substring(3, 6)); //1st index included
        System.out.println(name.substring(2, name.length() - 1)); //last index excluded

        System.out.println(name.replace("n", "nn")); //replace
        System.out.println(name.replace('a', 'u'));

        System.out.println(name.startsWith("V")); //return true - start with V

        System.out.println(name.endsWith("i")); //return false - ends with i

        System.out.println(name.charAt(2)); //char at index

        System.out.println(name.indexOf('a')); //index of char
        System.out.println(name.indexOf("Vi")); //index of string
        System.out.println(name.indexOf('a', 4)); //index of char from index

        System.out.println(name.lastIndexOf('a')); //last index of char
        System.out.println(name.lastIndexOf('a', 4)); //last index of char from index

        System.out.println(name.equals("Vinayak Sahu Ji")); //is equal
        System.out.println(name.equalsIgnoreCase("vinayak saHU JI")); //is equal ignore case
    }
}