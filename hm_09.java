import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入高:");
        int h1=scn.nextInt();
        System.out.print("輸入寬:");
        int h2=scn.nextInt();
        System.out.println("面積:"+h1*h2);
        scn.close();

    }
}
