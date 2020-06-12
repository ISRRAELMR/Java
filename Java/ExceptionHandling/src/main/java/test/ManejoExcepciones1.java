package test;

import domain.*;


public class ManejoExcepciones1 {
    public static void main(String[] args) {
      try {
        Division division = new Division(10,0);
      } catch (OperacionExcepcion ex){
          System.out.println(ex.getMessage());
          ex.printStackTrace();
      }
        System.out.println("El programa continua");
      }
}
