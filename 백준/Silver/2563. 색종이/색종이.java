import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[100][100];
        for(int i=0;i<N;i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            for(int j = x; j<x+10 ; j++)
            {
                for(int k = y; k<y+10 ; k++)
                    arr[j][k]=1;
            }
        }
        int area = 0;
        for(int i = 0; i<100; i++)
        {
            for(int j = 0; j<100; j++)
            {
                if(arr[i][j]==1)
                    area++;
            }
        }
        System.out.println(area);
    }
}