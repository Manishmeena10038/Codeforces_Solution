import java.util.Scanner;
 
public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean flag = true;
            if(s1.length()!=s2.length()){
                System.out.println("NO");
                flag=false;
            }
            else{
 
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)!=s2.charAt(s1.length()-i-1)){
                        System.out.println("NO");
                        flag=false;
                        break;
                    }
                }
            }
        if(flag)
        System.out.println("YES");
    }
}