import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        while(true)
        {
            if(N%5==0)
            {
                count+=N/5;
                System.out.println(count);
                break;
            }
            else if(N<0)
            {
                System.out.println(-1);
                break;
            }
            N-=3;
            count++;
        }
    }
}