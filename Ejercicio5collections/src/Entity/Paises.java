
package Entity;


public class Paises implements Comparable<Paises> {
    
   private String nombrepais; 

    public Paises() {
    }

    public Paises(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    public String getNombrepais() {
        return nombrepais;
    }

    public void setNombrepais(String nombrepais) {
        this.nombrepais = nombrepais;
    }

    @Override
    public String toString() {
        return "Paises{" + "nombrepais=" + nombrepais + '}';
    }

    @Override
    public int compareTo(Paises t) {
       return this.nombrepais.compareTo(t.getNombrepais());
    }
   
   
    
    
}
