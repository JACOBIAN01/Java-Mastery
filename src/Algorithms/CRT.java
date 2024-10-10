package Algorithms;

public class CRT {

    public static int CRT(int size , int div[] , int rem[]){
        int j , x = 1;
        while (true){
            for(j = 0 ; j<size;j++){
                if(x%div[j]!=rem[j]){
                    break;
                }
                if(size==j){
                    return x;
                }
            }
        }
    }
}
