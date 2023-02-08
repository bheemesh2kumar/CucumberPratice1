package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class PropertyReaderUtil {


    private PropertyReaderUtil() {

    }
    
     public String getStoreName(String storeID) {
        return storeID;
    }


    public static String getPropertryValue(String key) {
        Properties properties = null;
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(System.getProperty("user.dir") +
                    "/src/test/resources/configs/app.properties");
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return properties.getProperty(key);
    }


}
