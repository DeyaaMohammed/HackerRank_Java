package java_bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                BigDecimal firstDecimal = new BigDecimal(s[j]);
                BigDecimal secondDecimal = new BigDecimal(s[j + 1]);
                if(firstDecimal.compareTo(secondDecimal) == -1){
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
