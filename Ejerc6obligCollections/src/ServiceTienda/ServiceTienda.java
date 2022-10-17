package ServiceTienda;

import Entity.Tienda;
import java.util.HashMap;
import java.util.Scanner;

public class ServiceTienda {

    Scanner leer = new Scanner(System.in);

    HashMap<String, Double> productos = new HashMap();

    public Tienda crearProducto() {

        Tienda tienda = new Tienda();

        return tienda;

    }

    public void cargarProducto() {

        do {
            Tienda tienda = crearProducto();
            System.out.println(" ingrese un producto  ");
            tienda.setProducto(leer.nextLine());
            System.out.println(" ingrese el valor del producto  ");
            tienda.setPrecio(leer.nextDouble());
            leer.nextLine();
            productos.put(tienda.getProducto(), tienda.getPrecio());

            System.out.println(" desea ingresar mas productos S /N ");

        } while (leer.nextLine().equalsIgnoreCase("S"));

        System.out.println("los productos de la lista son" + productos);

    }

    public void modificarPrecio() {

        System.out.println(" ingrese el producto a modificar su valor");
        String modificar = leer.nextLine();
        System.out.println(" ingrese el producto a modificar su valor");
        Double preciomodificar = leer.nextDouble();

        productos.replace(modificar, preciomodificar);
        System.out.println(" la lista con los precios modificados son " + productos);
        leer.nextLine();
    }

    public void eliminarProductos() {

        String eliminar;
  boolean bandera;
        do {
            System.out.println("ingrese producto a eliminar ");
            eliminar = leer.nextLine();
          
            
            if (productos.containsKey(eliminar)) {

                productos.remove(eliminar);
                System.out.println("Se ha eliminado de la lista" + eliminar);
                System.out.println(" la lista actualizada es " + productos);
                bandera = false;
            } else {

                System.out.println("Ingrese un producto correcto de la lista");
                bandera= true;
            }
        } while (bandera!=false);

    }

    public void mostrarMapa() {

        if (productos.size() > 0) {

            System.out.println("los productos de la lista actual son" + productos);

        }
    }
}
