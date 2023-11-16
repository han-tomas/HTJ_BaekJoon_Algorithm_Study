import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sorted = new int[N];
        for(int i = 0 ; i<N ; i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int rank = 0; 
        for(int j : sorted){
            if(!map.containsKey(j)){ // 중복된 원소에는 순위를 다시 매기지 않도록.
                map.put(j,rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k : arr){
            int ranking = map.get(k);
            sb.append(ranking).append(" ");
        }
        System.out.print(sb);
        
    }
}