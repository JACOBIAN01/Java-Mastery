package String;

import java.util.*;
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        int count=0;
        for(int i=0;i<text.length()-1;i++){
            if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'){
                count++;
                System.out.println(text.charAt(i));
            }
        }
        System.out.println("Number of Vowel: "+count);
    }
}
