package manejointerfaces;

import datos.*;

public class ManejoInterfaces {
     public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        
        datos = new ImplementacionMySql();
        datos.insertar();
    }
    
}
