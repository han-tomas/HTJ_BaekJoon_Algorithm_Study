/*
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=1;i<=T;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
    }
}