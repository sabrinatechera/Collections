
package Entity;

import java.util.Comparator;
import Entity.Pelicula;



public class ComparatorPelicula {
    
    public static Comparator<Pelicula> peliculaDuracionDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            
            return t2.getDuracionPeli().compareTo(t1.getDuracionPeli());
        }
      

        
    };

    
    public static Comparator<Pelicula> peliculaDuracionAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            
            return t1.getDuracionPeli().compareTo(t2.getDuracionPeli());
        }
      

        
    };
    
    public static Comparator<Pelicula> peliculaTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
      

        
    };
    
    public static Comparator<Pelicula> peliculaDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            
            return t1.getDirector().compareTo(t2.getDirector());
        }
      

        
    };
    
}
