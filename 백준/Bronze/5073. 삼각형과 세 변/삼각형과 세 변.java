import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if(input.equals("0 0 0"))
                break;
            else{
                String[] strarr = input.split(" ");
                int[] arr = new int[strarr.length];
                for(int i = 0; i<arr.length;i++){
                    arr[i]=Integer.parseInt(strarr[i]);
                }
                Arrays.sort(arr);
                if(arr[2] >= arr[0] + arr[1]) {
				    System.out.println("Invalid");
			    }else if(arr[0] == arr[1] && arr[1] == arr[2]) {
				    System.out.println("Equilateral");
			    }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				    System.out.println("Isosceles");
			    }else {
				    System.out.println("Scalene");
			    }
            }
        }
    }
}