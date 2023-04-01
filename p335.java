import java.util.Scanner;
public class p335{
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int casosDePrueba = tec.nextInt();

        for (int i = 0; i < casosDePrueba; i++){
            long base = 1;
            long q = 1;
            long alturaTotal = tec.nextLong();
            
            if (alturaTotal == 1) q = 1;
            else
                for(long altura = 2; altura <= alturaTotal; altura++){
                base += altura;
                q += base;
            }  
            System.out.println(q);
        }
        tec.close();
    }
}