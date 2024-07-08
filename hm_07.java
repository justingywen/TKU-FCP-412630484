import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入半徑:");
        int r=scn.nextInt();
        System.out.printf("面積:%.2f",r*r*Math.PI);
        scn.close();
    }
}
