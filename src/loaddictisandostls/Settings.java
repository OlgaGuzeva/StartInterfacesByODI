/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaddictisandostls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author guzeva
 * ODI_HOST
 * ODI_USER
 * ODI_PASS
 * ODI_WORK_REP
 * DICT_SCEN_NAME
 * DICT_SCEN_VERSION
 * OST_SCEN_NAME
 * OST_SCEN_VERSION 
 */
public class Settings {
    public static final String PATH_TO_PROPERTIES_2 = System.getProperty("user.dir") + 
                             File.separator + "settings" + File.separator + "settings2.properties";
    public static final String PATH_TO_PROPERTIES_10 = System.getProperty("user.dir") + 
                             File.separator + "settings" + File.separator + "settings10.properties";
    public static Properties prop;
    
    public static final String PATH_TO_ICON_SETTINGS = System.getProperty("user.dir") + "\\" + "Settings.png";
    public static final String PATH_TO_ICON_LOADING = System.getProperty("user.dir") + "\\" + "Loading.png";
    
    public static final String PATH_TO_CAR = System.getProperty("user.dir") + "\\" + "Car.png";
    public static final String PATH_TO_CAR_2 = System.getProperty("user.dir") + "\\" + "Car2.png";
    
    public static Properties getSettings(String serverAddr) {
        
        String path;
        FileInputStream fileInputStream;
        //инициализируем специальный объект Properties
        //типа Hashtable для удобной работы с данными
        prop = new Properties();
        
        if(serverAddr.equals("45.2")){
            path = PATH_TO_PROPERTIES_2;
        }else{
            path = PATH_TO_PROPERTIES_10;
        }
 
        try {
            //обращаемся к файлу и получаем данные
            fileInputStream = new FileInputStream(path);
            prop.load(fileInputStream);             
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
