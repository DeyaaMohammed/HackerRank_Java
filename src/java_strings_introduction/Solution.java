package java_strings_introduction;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int stringALength = A.length();
        int stringBLength = B.length();
        System.out.println(stringALength + stringBLength);

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        A = A.replaceFirst(A.substring(0, 1), A.substring(0, 1).toUpperCase());
        B = B.replaceFirst(B.substring(0, 1), B.substring(0, 1).toUpperCase());
        System.out.println( A + " " + B);
    }
}
