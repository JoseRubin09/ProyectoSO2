/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Jose Rubin
 */
public class ReadFile {

    public JSONArray  readJson (String path){
        JSONParser parser = new JSONParser(); 
        
        try{
            File file = new File(path);
            FileReader fr = new FileReader(file);
            JSONArray data = (JSONArray) parser.parse(fr);
            return data;
        } catch (FileNotFoundException e) {
            //En caso de que no exista o no se encuentre    
            e.printStackTrace();
        } catch (IOException e){
            //En caso de que el error lo tenga el archivo
            e.printStackTrace();
        } catch (ParseException e){
            //Error transformando el archivo
            e.printStackTrace();
        }
        return null;
    }
}
