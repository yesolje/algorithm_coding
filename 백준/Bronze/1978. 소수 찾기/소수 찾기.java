import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //30802번 문제
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        int result = 0 ; //소수의 갯수

        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();

            if(arr[i] != 1){
                boolean isPrimeNumber = true;
                for(int j = arr[i]-1 ; j > 1 ; j --){
                    if(arr[i]%j == 0){ //소수가 아닐 경우
                        
                        isPrimeNumber = false;
                        break;
                    }
                }
                result += (isPrimeNumber?1:0);
            }
        }
        
        //result
        System.out.println(result);

    }

}   