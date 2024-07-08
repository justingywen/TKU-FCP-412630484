import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("第一件商品價格:");
        int p1=scn.nextInt();
        System.out.print("第二件商品價格:");
        int p2=scn.nextInt();
        System.out.print("第三件商品價格:");
        int p3=scn.nextInt();
        System.out.println("總價:"+(p1+p2+p3));
        scn.close();
    }
}
