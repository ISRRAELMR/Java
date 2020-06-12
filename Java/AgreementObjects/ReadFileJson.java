/**
 * @author Israel Melendez Romero
 */
/*
  Java task 2, receives the path in method "readJson" where the json file is 
  located and creates the object "agreement".
*/

package netcraker3;
import com.google.gson.*;
import java.io.*;

public class ReadFileJson {
    public void readJson(String vsourceFile){
    try {
         String sourceFile = vsourceFile;
         BufferedReader br = new BufferedReader(new FileReader(sourceFile));
         Agreement agreement = new Gson().fromJson(br, Agreement.class);
         System.out.println("Object agreement="+agreement.name+"-"+agreement.signedBy+"-"+agreement.products[1].name);
    } catch (FileNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    
}
