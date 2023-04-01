import java.util.Scanner;
public class p617{
    public static void main(String[] args) {

        String hilo, x;
        int rdo, col = 0, fila = 0, b = 0, nCasosPrueba, nUsuarios, a, i; 
        Scanner tec = new Scanner(System.in);

        nCasosPrueba = tec.nextInt();
        for (a = 0; a < nCasosPrueba; a++){
            hilo = "";
            i = 0;
            nUsuarios = tec.nextInt();
            if (nUsuarios >= 1 && nUsuarios <= 20) {
                while (i != nUsuarios) {
                hilo += tec.next();
                hilo += "\n";
            i++;
            }
            x = "";
            for(col = 0; col<3; col++){
                b = 0;
                for(fila = 0; fila < nUsuarios; fila++){
                    rdo = col + b; 
                    x += hilo.charAt(rdo); 
                    b += 4;
                }
            }
            System.out.println(x);
            } 
        }
        tec.close();
    }
}