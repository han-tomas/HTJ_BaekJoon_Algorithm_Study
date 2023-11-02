import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = 0;
        for(int i = 1 ; i<=N ; i++)
        {
            int number = i;
            int sum = 0;
            while(number !=0)
            {
                sum += number%10;
                number/=10;
            }
            if(i+sum ==N)
            {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}