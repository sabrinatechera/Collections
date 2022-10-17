package ejercicio1colleccion;

import Service.ServiceRaza;
import java.util.Scanner;

public class Ejercicio1colleccion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiceRaza service = new ServiceRaza();

        do {
            service.cargarRaza();
            System.out.println("quiere seguir cargando razas si/no");
        } while (leer.nextLine().equalsIgnoreCase("SI"));

        service.eliminarRaza();
        service.mostrarRazas();
        service.ordenarArray();

    }

}
