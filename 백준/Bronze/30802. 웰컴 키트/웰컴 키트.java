import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //30802번 문제
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());

        int[] demand = new int[6];

        for(int i = 0 ; i < demand.length ; i ++){
            demand[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int p = sc.nextInt();

        //output result
        int tBundle = 0;
        int pBundle = 0;
        int pCount = 0;
        
        //solution

        //#1. tBundle
        for(int i = 0 ; i < demand.length ; i ++){
            do{

                if(demand[i]!= 0 ){ //수요가 없을 때에 대한 예외처리
                    demand[i] -= t;
                    tBundle ++;
                }
                
            }while(demand[i] > 0);

        }

        //#2. pBundle
        if(p != 0){ //묶음이 없을때에 대한 예외처리
            pBundle = n/p;
            pCount = n%p;
        }else{
            pBundle = 0;
            pCount = n;
        }


        //answer
        System.out.println(tBundle);
        System.out.print(pBundle + " " + pCount);

    }

}   