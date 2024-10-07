import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //3052번 문제
        
        Scanner sc = new Scanner(System.in);
           
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];

        for(int i=0; i< 10 ; i++){
            arr1[i] = Integer.parseInt(sc.nextLine());
            arr2[i] = arr1[i] % 42;
        }

        //int [] arr2 = {0,3,0,0,0,0,0,0,1,2}; //중복 있는 원본
        ArrayList<Integer> arr3 = new ArrayList<>();
        
        arr3.add(arr2[0]); //{0}
        int node =  1;
        boolean flag; //이 노드의 데이터를 넣을 것인가?

        for(int i = 1 ; i < arr2.length ; i ++){
            flag = true;
            for(int j = 0 ; j < arr3.size() ; j ++){
                if(arr3.get(j) == arr2[i]){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr3.add(arr2[i]);
            }


        }

        System.out.println(arr3.size());

    }

}   