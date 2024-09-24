import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //1152번 문제
        
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        if(a.equals(" ") || a.equals("\t")){
            System.out.println(0);
        }else{
            a = a.strip();
        
            a = a.replaceAll("\\t", " ");

            String arr[] = a.split(" ");
            System.out.println(arr.length);
        }
        
    }

}   