package oldPackage;

import java.util.Scanner;

public class StringMethodsPractice15th {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "Dear <|name|>, This Java Course is nice, Thanks";//input.nextLine();

        // #1 : convert into lower case
        String lowercase = name.toLowerCase();
        System.out.println(lowercase);

        // #2 : replace spaces with underscore
        String replace = name.replace(' ', '_');
        System.out.println(replace);

        // #3 : replace <|name|> with given name
        String replaceName = name.replace("<|name|>", "Vinayak");
        System.out.println(replaceName);

        // #4 : detect double && triple spaces
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        // #5 : convert into letter form
        int indexOfFirstSpace = replaceName.indexOf(' ', 5);
        System.out.println(indexOfFirstSpace);
        char charAtIndx = replaceName.charAt(indexOfFirstSpace);
        System.out.println(charAtIndx);
        String newString = replaceName.replaceFirst(" ", "\n\t");
        System.out.println(newString);
    }
}