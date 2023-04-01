import java.util.Scanner;

public class p616 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, i;
        String golpeo;
        n = tec.nextInt();
        while (n != 0) {
            boolean direccionDerecha = true;
            int marcadorA = 0;
            int marcadorB = 0;
            for (i = n; i > 0; i--) {
                golpeo = tec.next();
                if (golpeo.equals("PIC"))
                    direccionDerecha = !direccionDerecha;
                if (golpeo.equals("PONG!")) {
                    if (direccionDerecha) marcadorA++;
                    else marcadorB++;
                } 
            }            
            System.out.println(marcadorA + " " + marcadorB);
            n = tec.nextInt();
        }
        tec.close();
    }
}