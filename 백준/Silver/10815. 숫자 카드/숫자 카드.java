import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < N ; i++){
            map.put(Integer.parseInt(st.nextToken()),0);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M ; i++){
            if(map.get(Integer.parseInt(st.nextToken()))!=null){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
        }
        System.out.print(sb);
    }
}