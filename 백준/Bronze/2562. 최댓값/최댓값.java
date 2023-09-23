import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0;i<9;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max=arr[0];
        int order=0;
        for(int i=0;i<9;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                order=i;
            }
        }
        System.out.println(max);
        System.out.println(order+1);
    }
}