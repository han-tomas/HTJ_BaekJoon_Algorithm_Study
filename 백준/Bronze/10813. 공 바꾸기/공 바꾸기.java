import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=i+1;
        }
        for(int n=0;n<M;n++)
        {
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j =Integer.parseInt(input[1]);
            int temp = arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}