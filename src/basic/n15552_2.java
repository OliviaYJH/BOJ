package basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class n15552_2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scan.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i<n; i++){
            String cmd = scan.next();

            if(cmd.equals("push")){
                int num = Integer.parseInt(scan.next());
                stack.push(num);
            }
            else if(cmd.equals("top")){
               if(stack.empty()) bw.write("-1\n");
               else  bw.write(stack.peek() + "\n");
            }
            else if(cmd.equals("size")) bw.write(stack.size() + "\n");
            else if(cmd.equals("empty")){
                if(stack.empty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if(cmd.equals("pop")){
                if(stack.empty()) bw.write("-1\n");
                else bw.write(stack.pop() + "\n");
            }
        }
        bw.flush();
    }
}
