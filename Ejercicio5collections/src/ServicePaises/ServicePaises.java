//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
package ServicePaises;

import Entity.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class ServicePaises {

    Scanner leer = new Scanner(System.in);
    HashSet<Paises> paises;
    
    public ServicePaises() {
        this.paises = new HashSet();    }

    private Paises crearPais() {

        Paises pais = new Paises();

        return pais;

    }

    public void cargarPais() {

        do {
            Paises pais = crearPais();
            System.out.println(" ingrese un pais a la lista");
            pais.setNombrepais(leer.nextLine());
            paises.add(pais);
            System.out.println("desea ingresar otro pais S/N");
        } while (leer.nextLine().equalsIgnoreCase("S"));

        System.out.println(paises);
    }

    
    public void paisesOrdenadoAscen(){
        
//      ArrayList<Paises>  listapaises= new ArrayList(paises);
//      Collections.sort(listapaises);

       TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(paises);
        System.out.println(" los paises ordenados son : " + myTreeSet);
        
        
    }
    
   public void eliminarPais(){
     
       Iterator<Paises>it= paises.iterator();
       
       System.out.println(" Que pais desea eliminar");
       
       String paisEliminar= leer.nextLine();
       boolean eliminado=false;
       while(it.hasNext()){  
           
           if (it.next().getNombrepais().equalsIgnoreCase(paisEliminar)) {
               it.remove();
               System.out.println("la lista queda "+ paises);
               eliminado=true;
               break;
           }
       
           
               
           }
       if (!eliminado) {
               System.out.println("no se encontro la pais");
       
        }
       
   
       
        
    } 
    
    
}
