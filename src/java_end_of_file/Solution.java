package java_end_of_file;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            if(line.contains("end-of-file")){
                break;
            }
            lineNumber++;
        }
    }
}
