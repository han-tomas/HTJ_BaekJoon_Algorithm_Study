import java.util.*;


public class Main{
    public int gcd(int a, int b){
        while(b!=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    
    public void lcd(int a, int b){
        System.out.println(a * b / gcd(a, b));
    }
    
    
    public static void main(String[] args){
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            T.lcd(a,b);
        }
    }
}