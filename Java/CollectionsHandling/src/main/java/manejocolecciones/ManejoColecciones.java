
package manejocolecciones;

import java.util.*;


public class ManejoColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        miLista.add(3);
       // imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");  // elementos duplicados no se agregan al set
    //    imprimir(miSet);
        
        Map miMapa = new HashMap();
        // Lave, valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Carlos");
        // Elemento con llave duplicado
        miMapa.put("valor3", "Rosario");
        // imprimos llaves
        imprimir(miMapa.keySet());
        // imprimimos valores
        imprimir(miMapa.values());
        
        System.out.println("valor de 3" + miMapa.get("valor3"));
        
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento:" + elemento);
        }
        System.out.println("");
    }
}
