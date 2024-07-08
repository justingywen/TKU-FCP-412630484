import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入姓名:");
        String s1=scn.next();
        System.out.print("輸入年齡:");
        String s2=scn.next();
        System.out.print("輸入城市:");
        String s3=scn.next();
        System.out.println(s1+","+s2+","+s3);
    }
}
