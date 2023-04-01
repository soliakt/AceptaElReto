import java.util.Scanner;
public class p615 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, f, c, t;
        c = tec.nextInt();
        while(c-- != 0){
            n = tec.nextInt();
            f = tec.nextInt();
            t = tec.nextInt();
            System.out.println((t % (n+1)) * f);
        }
        tec.close();
    }
}