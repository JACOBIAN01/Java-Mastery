package String;

import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        if (isPalindrome(text)) {
            System.out.println("Given text is a Palindrome");
        } else {
            System.out.println("Given text is not a Palindrome");
        }
        sc.close();
    }
}