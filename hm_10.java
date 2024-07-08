import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入華氏溫度:");
        int F=scn.nextInt();
        System.out.println("攝氏溫度:"+(F-32)*5/9);
        scn.close();
    }
}
