package java_substring_comparisons;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s;
        String currentSubString;
        for(int i = k; i <= s.length(); i++){
            currentSubString = s.substring(i - k, i);
            if(largest.compareTo(currentSubString) < 0){
                largest = currentSubString;
            }
            if(smallest.compareTo(currentSubString) > 0){
                smallest = currentSubString;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
