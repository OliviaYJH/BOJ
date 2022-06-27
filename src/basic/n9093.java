package basic;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class n9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (T-- > 0){
            String str = br.readLine() + "\n"; // I am happy today
            Stack<Character> stack = new Stack<>();

            for(char ch : str.toCharArray()){
                if(ch == '\n' || ch == ' '){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                }
                else{
                    stack.push(ch);
                }
            }
            bw.flush();
        }
    }

}
