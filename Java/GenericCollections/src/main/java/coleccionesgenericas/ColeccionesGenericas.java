package coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        // No permite guardar datos enteros ya que se definio para tipo string
       // miLista.add(123);
       miLista.add("Juan");
       miLista.add("Karla");
       miLista.add("Juan");
       imprimir(miLista);
       
       Set<String> miSet = new HashSet();
       miSet.add("100");
       miSet.add("200");
       miSet.add("200");       
       imprimir(miSet);
       
       Map<String, String> miMapa = new HashMap();
       miMapa.put("1", "Juan");
       miMapa.put("2", "Karla");
       miMapa.put("3", "Carlos");
       miMapa.put("3", "Rosario");
       
       imprimir(miMapa.keySet());
       imprimir(miMapa.values());
       
        System.out.println("value 3 = " + miMapa.get("3"));
        
        for(String elemento: miMapa.values()){
            System.out.println("valores =" + elemento);
        }
    }
    private static void imprimir(Collection<String> col){
       for(String elemento: col){
           System.out.println("elemento:" + elemento);
       }
        System.out.println("");
    }
}
