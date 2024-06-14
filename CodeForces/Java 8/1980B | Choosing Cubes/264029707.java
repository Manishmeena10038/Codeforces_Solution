import java.util.*;
 
public class DmitryCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt();  // number of cubes
            int f = scanner.nextInt();  // index of favorite cube (1-based)
            int k = scanner.nextInt();  // number of removed cubes
            
            int[] cubes = new int[n];
            for (int i = 0; i < n; i++) {
                cubes[i] = scanner.nextInt();
            }
            
            int favoriteValue = cubes[f - 1];  // value of the favorite cube
            
            // Sort cubes in non-increasing order
            Integer[] sortedCubes = Arrays.stream(cubes).boxed().toArray(Integer[]::new);
            Arrays.sort(sortedCubes, Collections.reverseOrder());
            
            // Count occurrences of favoriteValue in the original array
            int originalCount = 0;
            for (int i = 0; i < n; i++) {
                if (cubes[i] == favoriteValue) {
                    originalCount++;
                }
            }
            
            // Count occurrences of favoriteValue in the first k cubes of the sorted array
            int removedCount = 0;
            for (int i = 0; i < k; i++) {
                if (sortedCubes[i] == favoriteValue) {
                    removedCount++;
                }
            }
            
            if (removedCount == originalCount) {
                System.out.println("YES");
            } else if (removedCount == 0) {
                System.out.println("NO");
            } else {
                System.out.println("MAYBE");
            }
        }
        
        scanner.close();
    }
}