
package genericos;

public class ClaseGenerica<T> {
    // Definicmos la variable de tipo generico T
    T objeto;
    
    //constructor de clase generica
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo () {
        System.out.println("El tipo T es:" + objeto.getClass().getSimpleName());
    }
    
}
