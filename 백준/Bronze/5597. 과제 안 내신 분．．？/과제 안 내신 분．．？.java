import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] student = new int[30];
        for(int i=0;i<28;i++)
        {
            int submit = Integer.parseInt(br.readLine());
            student[submit-1]=1;
        }
        for(int i =0;i<30;i++)
        {
            if(student[i]!=1)
                System.out.println(i+1);
        }
    }
}