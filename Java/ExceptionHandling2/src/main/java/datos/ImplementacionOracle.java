
package datos;

import excepciones.*;

public class ImplementacionOracle implements AccesoDatos {
    private boolean simularError;
    @Override
    public void insertar() throws AccesoDatosEx{
        if(simularError){
            throw new EscrituraDatosEx("Error al insertar desde Oracle");
        }
        else {
             System.out.println("Insertar desde Oracle");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(simularError){
            throw new LecturaDatosEx("Error en lectura de datos Oracle");
        }
        else{
        System.out.println("Listar desde Oracle");
        }
    }

  @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }


    public boolean isSimularError() {
        return this.simularError;
    }
}
