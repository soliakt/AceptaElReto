import java.util.Scanner;

public class p622 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nota;
        int q;

        while((q = tec.nextInt())!=0){
            int sumatorio = 0;
        
            for(int i = 0; i < q; i++) {
                nota = tec.nextInt();
                sumatorio += nota;
            }
            int notaPrometida = tec.nextInt();
            int notaObjetivo = notaPrometida * (q + 1) - sumatorio;
            if (notaObjetivo < 0 || notaObjetivo > 10) System.out.println("IMPOSIBLE");
            else System.out.println(notaObjetivo); 
        }
        tec.close();
    }
}