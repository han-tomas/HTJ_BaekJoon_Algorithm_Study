import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N ; i++)
        {
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        long total = 0;
        for(int i = 0; i<N;i++)
        {
            if(max<arr[i])
                max=arr[i];
            total += arr[i];
        }
       System.out.println(total*100.0/max/N);
    }
}