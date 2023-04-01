import java.util.Scanner;

public class p663{
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int p, n = tec.nextInt();
        for(int i = n; i > 0; i--){
            p = tec.nextInt();
            if (p < 0) System.out.println(p);
            else System.out.println(p - 1);
        }
        tec.close();
    }
}