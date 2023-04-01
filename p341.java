package github;

// Funciona perfecto pero da RTE

import java.util.Scanner;

public class p341 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cajas, clientes;
        do {
            cajas = tec.nextInt();
            clientes = tec.nextInt();
            int [] disposicionCajas = new int [cajas];
            int [] tiemposDeEspera = new int [clientes + 4]; // Creo un array con 4 posiciones adicionales por si los últimos clientes se quedan sin cajas

            for (int i = 0; i < clientes; i++) tiemposDeEspera [i] = tec.nextInt();
            for (int i = 0; i < cajas; i++) disposicionCajas [i] = tiemposDeEspera [i];
            for (int i = cajas; i < clientes; i++) { // For para asignar el tiempo de espera a la proxima caja disponible
                boolean clienteConCajaAsignada = false;
                while(clienteConCajaAsignada == false) {
                    for (int j = 0; j < cajas; j++) {
                        if (disposicionCajas [j] == 0 && clienteConCajaAsignada == false) {
                            disposicionCajas [j] = tiemposDeEspera [i]; 
                            clienteConCajaAsignada = true;
                        }
                        else if (disposicionCajas [j] == 0 && clienteConCajaAsignada == true) {
                            i++;
                            disposicionCajas [j] = tiemposDeEspera [i];
                        }
                        else {
                            disposicionCajas [j]--;
                        }
                    }
                }
            }
            int cajaIsmael = 8;
            int tiempoEspera = Integer.MAX_VALUE;
            for (int i = 0; i < cajas; i++) {
                if (disposicionCajas[i] < tiempoEspera) {
                    tiempoEspera = disposicionCajas[i];
                    cajaIsmael = i;
                }
            }
            System.out.println(cajaIsmael + 1);
        } while (tec.hasNext());
        tec.close();
    }
}
