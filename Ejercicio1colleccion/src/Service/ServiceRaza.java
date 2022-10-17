package Service;

import Entity.Raza;
import java.util.*;

public class ServiceRaza {

    Scanner leer = new Scanner(System.in);
    List<Raza> razas;

    public ServiceRaza() {
        this.razas = new ArrayList();

    }

    private Raza crearRaza() {

        Raza raza = new Raza();

        return raza;
    }

    public void cargarRaza() {

        Raza raza = crearRaza();
        System.out.println("ingrese el nombre de la raza");
        raza.setRazaPerro(leer.nextLine());
        razas.add(raza);

    }

    public void mostrarRazas() {
        System.out.println(razas.size());
        for (Raza aux : razas) {

            System.out.println(aux);
        }


}
   public void eliminarRaza(){
     
       Iterator<Raza>it= razas.iterator();
       
       System.out.println(" Que raza desea eliminar");
       
       String razaEliminar= leer.nextLine();
       boolean eliminado=false;
       while(it.hasNext()){  
           
           if (it.next().getRazaPerro().equalsIgnoreCase(razaEliminar)) {
               it.remove();
               System.out.println("eliminado");
               eliminado=true;
               break;
           }
       
           
               
           }
       if (!eliminado) {
               System.out.println("no se encontro la raza");
       
        }
       
   
       
        
    }
    
    
    public void ordenarArray(){
       
      Collections.sort(razas);
       
   }    
    
    

    
    
    
}
