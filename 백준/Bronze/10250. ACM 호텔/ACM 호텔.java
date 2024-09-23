import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //10250번 문제
        
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        
        ArrayList<String> resultList = new ArrayList<>();

        for(int i = 0 ; i < t ; i++){

            ArrayList<String> primary = new ArrayList<>(); //호텔별 우선순위 리스트

            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());

            //선호도에 따라 순서가 있는 arrayList 를 만든다

            for(int x = 1 ; x < w+1 ; x ++ ){ //호수
                for(int y = 1 ; y < h+1 ; y ++){
                    String temp1 = Integer.toString(y); //층수
                    if(x < 10){
                        temp1 = temp1 + "0" + Integer.toString(x);
                    }else{
                        temp1 = temp1 + Integer.toString(x);
                    }
                    primary.add(temp1);
                }
            }

            resultList.add(primary.get(n-1));

        }

        for(int i = 0 ; i < resultList.size();i++){
            System.out.println(resultList.get(i));
        }
        



    }

}