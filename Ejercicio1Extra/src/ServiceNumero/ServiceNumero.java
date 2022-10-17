package ServiceNumero;

import Entity.Numero;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceNumero {

    ArrayList<Integer> valores = new ArrayList();
    Scanner leer = new Scanner(System.in);

    private Numero crearNumero() {

        Numero numero = new Numero();

        return numero;
    }

    public void cargarNumeros() {
        Numero numero = crearNumero();


        do {
            System.out.println("ingrese el numero que quiere ingresar a la lista o -99 para salir");
            numero.setNumero(leer.nextInt());
            if (numero.getNumero() != -99) {
                valores.add(numero.getNumero());
            }

        } while (!numero.getNumero().equals(-99));

    }

    public void mostrarLista() {

        System.out.println("los numeros de la lista son :" + valores);
        System.out.println("---------------------------------------");
    }

    public void mostrarPromedio() {
        Double suma = 0.0;
        Double cont = 0.0;

        for (Integer valor : valores) {

            suma = suma + valor;
            cont++;

        }
        System.out.println(" la suma de los numeros de la lista es :" + suma);

        System.out.println("el promedio de la lista es :" + suma / cont);

    }

}


