import java.util.Scanner;
 
public class boysorgirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        for(char c:str.toCharArray()){
            int i = c -'a';
            arr[i] = 1;
        }
        int cnt = 0;
        for(int i:arr){
            if(i==1){
                cnt++;
            }
        }
        if(cnt%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
 
            System.out.println("IGNORE HIM!");
        }
    }
}