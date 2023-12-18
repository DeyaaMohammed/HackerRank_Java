package java_string_reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //1st Solution
        /*StringBuilder stringBuilder = new StringBuilder(A);
        if(A.equals(stringBuilder.reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/

        //Another Solution
        char[] charsOfA = A.toCharArray();
        String reversedA = "";
        for(int i = A.length() - 1; i >= 0; i--){
            reversedA += charsOfA[i];
        }
        if(A.equals(reversedA)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
