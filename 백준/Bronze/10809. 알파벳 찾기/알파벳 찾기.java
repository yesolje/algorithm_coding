import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //10809번 문제
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        int arr [] = new int[a.length()]; // 입력받은 수
        int alphabet [] = new int[26]; //제출할 결과값
        
        for(int i = 0 ; i < alphabet.length; i ++){
            alphabet[i] = -1;
        }

        for(int i = 0 ; i < a.length(); i ++){
            arr[i] = (int)a.charAt(i) - 97;
            int nn = arr[i];
            if(alphabet[nn]==-1){
                alphabet[nn] = i;
            }
        }

        //test
        for(int i = 0 ; i < alphabet.length; i ++){
           System.out.print( alphabet[i] + " ");

        }
       
    }

}   