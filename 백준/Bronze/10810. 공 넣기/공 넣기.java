import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int[] arr =new int[N];
        int M = Integer.parseInt(st.nextToken());
        for(int n=0;n<M;n++)
        {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for(int m = i-1;m<j;m++)
            {
                arr[m]=k;
            }
        }
       for(int z =0 ;z<N;z++)
       {
           System.out.print(arr[z]+" ");
       }
    }
}