import java.util.Scanner;

public class P605 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String n = "  ";
        
        while (n.charAt(0) != '.'){
            int contadorV = 0;
            int contadorI = 0;
            int contadorA = 0;
            n =  tec.nextLine().toUpperCase();
            if (n.charAt(0) == '.') break;
            for (int i = 0; i < n.length(); i++){
                if (n.charAt(i) == 'V') contadorV++;
                else if (n.charAt(i) == 'I') contadorI++;
                else if (n.charAt(i) == 'A') contadorA++;
            }
            if (n.charAt(n.length() - 1) == '.'){
                if (contadorV > contadorI) System.out.println("VERANO");
                else if (contadorI > contadorV) System.out.println("INVIERNO");
                else if (contadorI == contadorV) System.out.println("EMPATE");
            }
        }
        tec.close();
    }
}
