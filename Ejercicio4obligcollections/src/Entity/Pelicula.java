
package Entity;


public class Pelicula {


  private String titulo;
  private String director; 
  private Integer duracionPeli; 

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracionPeli) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPeli = duracionPeli;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(Integer duracionPeli) {
        this.duracionPeli = duracionPeli;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionPeli=" + duracionPeli + '}';
    }

   
  
    
}
