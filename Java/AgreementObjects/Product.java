/**
 * @author Israel Melendez Romero
 */
package netcraker3;

public class Product {
    Object objRef;
    Product products[]=new Product[10];
    String name;
    Float price;
    
    public Product(Object vobjRef,Product[] vproducts, String vname, Float vprice){
      objRef=vobjRef;
      products=vproducts;
      name=vname;
      price=vprice;
    }
}
