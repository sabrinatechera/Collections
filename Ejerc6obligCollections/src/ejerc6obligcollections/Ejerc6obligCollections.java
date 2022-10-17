package ejerc6obligcollections;

import ServiceTienda.ServiceTienda;
import java.util.Scanner;

public class Ejerc6obligCollections {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiceTienda serv = new ServiceTienda();
        String respuesta;
       
        int opcion;

        do {
             System.out.println(" ingrese una de las siguientes opciones (cargarproducto: 1),(modificar precio:2),(eliminaar:3),(mostrar mapa:4)");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    serv.cargarProducto();
                    break;
                case 2:
                    serv.modificarPrecio();
                    break;
                case 3:
                    serv.eliminarProductos();
                    break;
                case 4:
                    serv.mostrarMapa();
                    break;
            }
            
                  
        } while (opcion!=0);
    }
}
