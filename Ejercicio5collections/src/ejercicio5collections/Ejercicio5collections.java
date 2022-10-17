package ejercicio5collections;

import ServicePaises.ServicePaises;

public class Ejercicio5collections {

    public static void main(String[] args) {

        ServicePaises serv = new ServicePaises();

        serv.cargarPais();

        serv.paisesOrdenadoAscen();
        
        
        serv.eliminarPais();

    }

}
