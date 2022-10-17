package ejercicio4obligcollections;

import Service.ServicePelicula;

public class Ejercicio4obligcollections {

    public static void main(String[] args) {

        ServicePelicula serv = new ServicePelicula();
        serv.cargarPelicula();
        serv.mostrarPelicula();
        serv.mayorAunaHora();
        
        serv.peliculasDescendentes();
        serv.peliculasAscendentes();
        serv.peliculasDirectorAsc();
        serv.peliculasTituloAsc();
    }

}
