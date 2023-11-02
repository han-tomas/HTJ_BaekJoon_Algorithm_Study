import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        for(int i = -999 ; i<=999 ; i++)
        {
            for(int j = -999; j<=999 ; j++)
            {
                if(a*i + b*j  == c) 
                    if(d*i + e*j  == f) 
                        System.out.println(i+" "+j);
            }
        }
    }
}