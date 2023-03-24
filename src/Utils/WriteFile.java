/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;
import static Utils.Constants.txtAction;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author Jose Rubin
 */
public class WriteFile {
    
    ArrayList newTelefdata = new ArrayList();
//                      newdataGastos1 = (JSONArray) map2.get(key2);
//                    newdataGastos1.add(GastosSalario1.getText());
//                    obj.put(key2, newdataGastos1);
    
    public void writeData(String a){
        JSONArray data = txtAction.readJson("DataTelef.json");
        Map<String, Object> map2 = (Map<String, Object>) data.get(0);
        JSONObject obj = new JSONObject();
        JSONArray newJson = new JSONArray();
        for (String key2 : map2.keySet())
            switch(key2){
                case "Telefonos en el Mercado":
                    
                    newTelefdata = (JSONArray) map2.get(key2);
                    if (a == "1"){
                        newTelefdata.add("Xperia 10 IV");
                        obj.put(key2, newTelefdata);
                    } else {
                        newTelefdata.add("Xperia 1 IV");
                        obj.put(key2, newTelefdata);
                    }                        
                    break;
            }
        newJson.add(obj);
        
        try {
            FileWriter file = new FileWriter(new File(System.getProperty("user.dir"), "DataTelef.json"));            
            file.write(newJson.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newJson.toJSONString());
        
    }
}