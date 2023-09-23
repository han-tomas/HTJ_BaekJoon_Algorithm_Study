import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=i+1;
        }
        for(int n=0;n<M;n++)
        {
            st=new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for(int x = i-1 ; x<j;x++)
            {
                int temp = arr[x];
                arr[x]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int i = 0; i<N;i++)
            System.out.print(arr[i]+" ");
    }
}