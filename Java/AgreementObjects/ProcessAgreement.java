/**
 * @author Israel Melendez Romero
 */
/*
   Java task 1, receives an object of the "agreement" class and 
   stores the information on disk in json file
*/

package netcraker3;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.google.gson.*;
import java.io.*;

public class ProcessAgreement {
    
    public void createJsonFile(Agreement vagreement) {      
        try{          
        Agreement agreement = vagreement;
        String nameJsonFile = agreement.name.replace('/','-')+".json";
        Gson gson = new Gson();
        String json = gson.toJson(agreement);
        System.out.println("gson=" + json);
        FileWriter fileWriter = new FileWriter("c:\\Java\\"+nameJsonFile);
        fileWriter.write(json);
        fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}