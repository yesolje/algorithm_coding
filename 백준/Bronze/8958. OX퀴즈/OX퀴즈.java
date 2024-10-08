import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //8958번 문제
        
        Scanner sc = new Scanner(System.in);
        
        int caseNumber = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> resultArray = new ArrayList<>();

        for(int i = 0 ; i < caseNumber ; i ++){

            String quiz = sc.nextLine();

            String [] arr = quiz.split("");

            //System.out.println("::" + arr.length);
            int totalScore = 0;
            int continueScore = 0 ;
            for(int j = 0 ; j < arr.length ; j ++){
                if(j == 0){ //첫번째 문제
                    if(arr[0].equals("O")){
                        totalScore ++;
                        continueScore ++;
                    }
                }else { // 두번째 이상 문제
                    if(arr[j].equals("O") && arr[j-1].equals("O")){
                        continueScore ++;
                        totalScore += continueScore;
                    }else if(arr[j].equals("O") && arr[j-1].equals("X")){
                        continueScore = 1;
                        totalScore += 1;
                    }else if(arr[j].equals("X")){
                        continueScore = 0;
                    }

                }
            }
            resultArray.add(totalScore);
            

        }

        for(int i = 0 ; i < resultArray.size(); i ++){
            System.out.println(resultArray.get(i));
        }
        

    }

}   