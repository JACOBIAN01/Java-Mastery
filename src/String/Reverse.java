import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Text: ");
        String text = sc.nextLine();
        System.out.println("Reverse Text");
        for(int i =text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
        sc.close();
    }
}
