import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
        //1152번 문제
        
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
       
        String d = Integer.toString(a * b * c) ;

        String[] f = d.split("");
        
        int[] g = {0,0,0,0,0,0,0,0,0,0};

        for(int i = 0 ; i < f.length ; i++){
            int h = Integer.parseInt(f[i]);
            g[h]++;
        }
        
        for(int j = 0 ; j < g.length ; j ++){
            System.out.println(g[j]);
        }
    }

}   