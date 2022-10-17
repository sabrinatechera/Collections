package ServiceCantanteFamoso;

import Entity.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceCantanteFamoso {

    Scanner leer = new Scanner(System.in);
    ArrayList cantantes = new ArrayList();

    private CantanteFamoso crearCantante() {

        CantanteFamoso cantante = new CantanteFamoso();
        return cantante;
    }

    public void cargarCantante() {

        Integer cont = 0;

        do {
            CantanteFamoso cantante = crearCantante();
            System.out.println(" ingrese el nombre de un cantante famoso ");
            cantante.setNombreCantante(leer.nextLine());

            System.out.println(" ingrese su disco con mas ventas");
            cantante.setDiscoConMasVentas(leer.nextLine());

            cantantes.add(cantante);
            cont++;
        } while (cont < 5);

    }

    public void mostrarLista() {

        for (Object cantante : cantantes) {

            System.out.println(cantante);

        }

    }

    public void menu() {

        System.out.println("opcion 1:cargar otro cantante, opcion 2: mostrar lista, opcion 3:eliminar cantante, opcion 4 : salir Y/N ");

        Integer respuesta = leer.nextInt();
        boolean bandera = true;
        
         
            do {
            
        
            switch (respuesta) {
        
            case 1:

                
                    CantanteFamoso cantante = crearCantante();
                    System.out.println(" ingrese el nombre de un cantante famoso ");
                    cantante.setNombreCantante(leer.nextLine());
                    leer.next();
                    System.out.println(" ingrese su disco con mas ventas");
                    cantante.setDiscoConMasVentas(leer.nextLine());
                    leer.next();
                    cantantes.add(cantante);
                  
                    bandera = true;

            
                break;

            case 2:
                mostrarLista();
                break;
            case 3:
                mostrarLista();
                break;
            case 4:
                System.out.println(" usted ha salido del sistema satisfactoriamente");
                break;

        }
    } while (bandera != false);
    }
}

