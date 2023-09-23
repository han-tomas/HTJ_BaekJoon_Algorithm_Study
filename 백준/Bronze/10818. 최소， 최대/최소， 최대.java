import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] strarr = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i<N;i++)
        {
            arr[i]=Integer.parseInt(strarr[i]);
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<N;i++)
        {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println(min+" "+max);
    }
}