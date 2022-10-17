//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
package Service;

import Entity.ComparatorPelicula;
import Entity.Pelicula;
import java.util.*;

public class ServicePelicula {

Scanner leer;
List<Pelicula>peliculas;



    public ServicePelicula() {
        this.peliculas= new ArrayList();
        
        this.leer= new Scanner(System.in);
      
    }


public Pelicula crearPelicula(){
    
   Pelicula pelicula = new Pelicula();
   
   return pelicula;
   
}

public void cargarPelicula(){
    
    do {
        
    Pelicula pelicula= crearPelicula();
    
    System.out.println(" ingrese el nombre de la pelicula");
    pelicula.setTitulo(leer.nextLine());
    
    System.out.println(" ingrese el director de la pelicula ");
    pelicula.setDirector(leer.nextLine());
    
    System.out.println(" ingrese la duracion de la pelicula");
    pelicula.setDuracionPeli(leer.nextInt());
    
    leer.nextLine();
    
    peliculas.add(pelicula);
     
        System.out.println("quiere ingresar otra pelicula S/N");
    } while (leer.nextLine().equalsIgnoreCase("S"));
       
    
} 



public void mostrarPelicula(){
    
    for (Pelicula aux : peliculas) {
        
        System.out.println(aux);
        
    }
     
}

public void mayorAunaHora(){
    
    for (Pelicula aux : peliculas) {
        if (aux.getDuracionPeli()>1) {
            System.out.println("la pelicula "+ aux.getTitulo()+" tiene una duracion de "+ aux.getDuracionPeli());
            
        }
    }
    
}

 public void peliculasDescendentes(){
     
     Collections.sort(peliculas, ComparatorPelicula.peliculaDuracionDescendente);
     
     for (Pelicula pelicula : peliculas) {
         System.out.println(pelicula);
         
     }
 }

public void peliculasAscendentes(){
     
     Collections.sort(peliculas, ComparatorPelicula.peliculaDuracionAscendente);
     
     for (Pelicula pelicula : peliculas) {
         System.out.println(pelicula);
         
     }
 }

public void peliculasTituloAsc(){
     
     Collections.sort(peliculas, ComparatorPelicula.peliculaTitulo);
     
     for (Pelicula pelicula : peliculas) {
         System.out.println(pelicula);
         
     }
 }

    public void peliculasDirectorAsc(){
     
     Collections.sort(peliculas, ComparatorPelicula.peliculaDirector);
     
     for (Pelicula pelicula : peliculas) {
         System.out.println(pelicula);
         
     }
 }
}
