import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        Set<Integer>  set1 = new HashSet<>();
        Set<Integer>  set2 = new HashSet<>();
        for (int i = 0; i < N; i++){
            set1.add(scan.nextInt());
        }
        for (int i = 0; i < M; i++){
            set2.add(scan.nextInt());
        }
        int answer = 0;
        for (int n: set1){
            if(!set2.contains(n)) answer++; 
        }
        for (int n: set2){
            if(!set1.contains(n)) answer++; 
        }
        System.out.print(answer);
    }
}