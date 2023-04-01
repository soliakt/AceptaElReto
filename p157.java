import java.util.Scanner;

public class p157 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int dia=0, mes, suma=0, intentos;
        suma+=dia;

        intentos = tec.nextInt();


        for(int j = 0; j < intentos; j++){
            dia = tec.nextInt();          
            mes = tec.nextInt();
            suma = 0;    
    
            for(int i = 12; i > mes; i--){
                switch (i) {
                    case 4: case 6: case 9: case 11:
                    suma+=30;
                        break;
                    case 2:
                        suma+=28;
                    break;
                    default:
                        suma+=31;
                    break;
                }
            }
            switch (mes) {
                case 4: case 6: case 9: case 11:
                    suma+=30-dia;
                break;
                case 2:
                    suma+=28-dia;
                break;
                default:
                    suma+=31-dia;
                break;
            }
            System.out.println(suma);
        }
        tec.close();
    }
}
