import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //1152번 문제
        
        Scanner sc = new Scanner(System.in);

        int[] a = new int[8];

        for(int i = 0 ; i < a.length ; i ++){
            a[i] = sc.nextInt();
        }

        String result = "ascending";
        boolean flag = true;
        for(int i = 0 ; i < a.length-1 ; i ++){
            if(a[i] > a[i+1]){
                flag = false;
                break;
            }
        }
        result = flag?"ascending":"";

        if(!result.equals("ascending")){
            for(int i = 0 ; i < a.length-1 ; i ++){
                if(a[i] < a[i+1]){
                    result = "mixed";
                    break;
                }else{
                    result = "descending";
                }
            } 
        }
        System.out.println(result);
    }

}   