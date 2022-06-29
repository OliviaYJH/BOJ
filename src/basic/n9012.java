package basic;

import java.util.Scanner;

public class n9012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n-- > 0){
            System.out.println(Check(scan.next()));
        }
    }

    public static String Check(String str){
        int num = str.length();
        int count = 0;

        for(int i = 0; i<num; i++){
            if(str.charAt(i) == '(')
                count += 1;
            else
                count -= 1;

            if(count < 0) return "NO";
        }

        if(count == 0) return "YES";
        else return "NO";
    }
}
