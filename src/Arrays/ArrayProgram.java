package Arrays;
import  java.util.*;
public class ArrayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Maximum Number of Elements: ");
        int num = sc.nextInt();
        int[] Number = new int[num+1];
        for(int i=0;i<=num;i++){
            Number[i] = i;
        }
        System.out.println("Array Elements are");
        for(int j =0;j<=num;j++){
            System.out.print(Number[j]+" , ");
        }
    }

}
