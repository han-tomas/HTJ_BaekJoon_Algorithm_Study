import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scan.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            int n = scan.nextInt();
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int M = scan.nextInt();
        for (int i = 0; i < M; i++){
            int n = map.getOrDefault(scan.nextInt(),0);
            sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}