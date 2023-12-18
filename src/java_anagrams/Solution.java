package java_anagrams;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()){
            a = a.toLowerCase();
            b = b.toLowerCase();

            java.util.HashMap<Character, Integer> stringAMap = new java.util.HashMap<Character, Integer>();
            for(int i =0; i < a.length(); i++) {
                if (stringAMap.containsKey(a.charAt(i))) {
                    stringAMap.put(a.charAt(i), (stringAMap.get(a.charAt(i)) + 1));
                }
                else{
                    stringAMap.put(a.charAt(i), 1);
                }
                if (stringAMap.containsKey(b.charAt(i))) {
                    stringAMap.put(b.charAt(i), (stringAMap.get(b.charAt(i)) - 1));
                }
                else{
                    stringAMap.put(b.charAt(i), -1);
                }
            }

            for(Integer value: stringAMap.values()){
                if(value != 0){
                    return false;
                }
            }

            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
