/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaddictisandostls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;

/**
 *
 * @author guzeva
 */
public class LoadDictisAndOstls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       findOrCreateSettingsFiles();
       MainFrame mf = new MainFrame();
    }
    
    private static void findOrCreateSettingsFiles() {
        File folder = new File(System.getProperty("user.dir") + 
                             File.separator + "settings");
        if (!folder.exists()) {
            folder.mkdir();
            File file1 = new File(folder, "settings10.properties");
            File file2 = new File(folder, "settings2.properties");
            Properties propDflt = getDfltProps();
            try{ 
                file1.createNewFile();                
                propDflt.store(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1), "UTF-8")), null);
            }
            catch(IOException ex){ex.getStackTrace();}
            try{ 
                file2.createNewFile();
                propDflt.store(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "UTF-8")), null);
            }
            catch(IOException ex){ex.getStackTrace();}
        }
        
    }
    
    private static Properties getDfltProps(){
        Properties propDflt = new Properties();
        propDflt.setProperty("ODI_HOST", "http://10.0.45.3:10001/oraclediagent");
        propDflt.setProperty("ODI_USER", "guzeva");
        propDflt.setProperty("ODI_PASS", "guzeva");
        propDflt.setProperty("ODI_WORK_REP", "WORKREP1");
        propDflt.setProperty("DICT_SCEN_NAME", "MAIL");
        propDflt.setProperty("DICT_SCEN_VERSION", "001");
        propDflt.setProperty("OST_SCEN_NAME", "LOAD_OSTLS_G__FULL");        
        propDflt.setProperty("OST_SCEN_VERSION", "001");
        propDflt.setProperty("REC_OTL_SCEN_NAME", "LOAD_APSTO_FULL");        
        propDflt.setProperty("REC_OTL_SCEN_VERSION", "001");
        return propDflt;
    }
}
