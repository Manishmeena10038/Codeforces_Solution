import java.util.Scanner;
public class capitilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        String fp = s.substring(0,1);
        String sp = s.substring(1,s.length() );
        fp = fp.toUpperCase();
        sb.append(fp);
        sb.append(sp);
        System.out.println(sb);
    }
}