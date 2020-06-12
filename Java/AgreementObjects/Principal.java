/**
 * @author Israel Melendez Romero
 */
/*
   class that contains main method and tests are performed 
   for classes of tasks 1 and 2
*/

package netcraker3;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.google.gson.*;
import java.io.*;

public class Principal {

    public static void main(String args[]) {
/* Block to test class ProcessAgreement which reads object of type Agreement 
        and saves it to disk in json 
        */        
        Agreement agreement;
        Product parentProductAuto;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String actualDate = dateFormat.format(date);
        String agreementCode = "Agreement "+actualDate;
        String signed = "Israel Melendez Romero";
 // create array products child asociate to Parent Product "Auto"
        parentProductAuto = new Product(null,null,"Auto",(float) 1000.99);
        Object parentObjAuto = parentProductAuto;
        Product productsChild[] = new Product[5];
        productsChild[0] = new Product(parentObjAuto, null, "Steering wheel", (float) 5.99);
        productsChild[1] = new Product(parentObjAuto, null, "Tire", (float) 5.99);
        productsChild[2] = new Product(parentObjAuto, null, "Lever", (float) 5.99);
        productsChild[3] = new Product(parentObjAuto, null, "Windshield", (float) 5.99);
        productsChild[4] = new Product(parentObjAuto, null, "Rearview", (float) 5.99);
        parentProductAuto.products=productsChild;
// create array of Parent Products asociate to Agreement       
        Object parentObject = new Agreement(agreementCode, signed, null);
        Product products[] = new Product[5];
        products[0] = new Product(parentObject, null, "Auto", (float) 1000.99);
        products[1] = new Product(parentObject, null, "Laptop", (float) 80.99);
        products[2] = new Product(parentObject, null, "Television", (float) 88.99);
        products[3] = new Product(parentObject, null, "Microwave", (float) 20.99);
        products[4] = new Product(parentObject, null, "Bike", (float) 60.99);
        agreement = new Agreement(agreementCode, signed, products);
        ProcessAgreement vprocess = new ProcessAgreement();
        vprocess.createJsonFile(agreement);

/* Block to test class ReadFileJson which reads path and file json name 
        and crates object of type "Agreement" 
        */                
        String vsourceFile = "c:\\Java\\"+agreement.name.replace('/','-')+".json";
        ReadFileJson readJson = new ReadFileJson();
        readJson.readJson(vsourceFile);
    }
}
