import java.util.Scanner;
public class p658 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double n = 1; 
        int entrada, i = 0; 
        while ((entrada = tec.nextInt()) != 0){
            n = 1;
            i = 0;
            do {
                entrada = entrada - (int)Math.pow(n, 2);
                n += 2;
                i++;
            } while (entrada > 0);
            System.out.println(i);
        }
        tec.close();
    }
}