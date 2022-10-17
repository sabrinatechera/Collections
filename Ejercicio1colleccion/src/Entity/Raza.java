
package Entity;


public class Raza implements Comparable<Raza> {
  
    private String RazaPerro;

    public Raza() {
    }

    public Raza(String RazaPerro) {
        this.RazaPerro = RazaPerro;
    }

    public String getRazaPerro() {
        return RazaPerro;
    }

    public void setRazaPerro(String RazaPerro) {
        this.RazaPerro = RazaPerro;
    }

    @Override
    public String toString() {
        return "Raza:" + "Raza Perro:" + RazaPerro ;
    }

    @Override
    public int compareTo(Raza t) {
        return this.RazaPerro.compareTo(t.getRazaPerro());
    }
    

    
    
}
