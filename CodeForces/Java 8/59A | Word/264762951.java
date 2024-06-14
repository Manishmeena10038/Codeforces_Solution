import java.util.Scanner;
 
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int up = 0;
        int l = 0;
        for(char c: str.toCharArray()){
            if(Character.isUpperCase(c)){
                up++;
            }
            else{l++;}
        }
        if(up>l){
            System.out.println(str.toUpperCase());
        }
        else
        System.out.println(str.toLowerCase());
    }
}