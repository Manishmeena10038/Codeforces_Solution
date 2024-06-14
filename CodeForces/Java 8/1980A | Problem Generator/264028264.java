import java.util.Scanner;
 
public class ProblemBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  // number of test cases
        
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();  // number of problems in the bank
            int m = scanner.nextInt();  // number of upcoming rounds
            scanner.nextLine();  // consume the newline character
            String a = scanner.nextLine();  // string representing problem difficulties
            
            // Create a count array for difficulties 'A' to 'G'
            int[] count = new int[7];
            for (char c : a.toCharArray()) {
                count[c - 'A']++;
            }
            
            // Calculate the number of problems needed for each difficulty level
            int neededProblems = 0;
            for (int i = 0; i < 7; i++) {
                int required = m;  // each difficulty is needed `m` times
                if (count[i] < required) {
                    neededProblems += (required - count[i]);
                }
            }
            
            System.out.println(neededProblems);
        }
        
        scanner.close();
    }
}