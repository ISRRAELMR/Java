/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Israel Melendez Romero
 */
package netcraker3;
import java.util.*;
public class Agreement {
    String name;
    String signedBy;
    Product products[]=new Product[10];   
    
    public Agreement(String vname, String vsignedBy, Product vproducts[]){
      name=vname;
      signedBy=vsignedBy;
      products=vproducts; 
    }
}
