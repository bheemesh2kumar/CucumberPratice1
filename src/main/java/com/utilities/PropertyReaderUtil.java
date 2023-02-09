package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyReaderUtil {

    static final Properties properties = new Properties();
    static final Map<String, String> configLIst = new HashMap<String, String>();


    private PropertyReaderUtil() {

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


    static {

        try (FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") +
                "/src/test/resources/configs/app.properties")) {
            properties.load(fileInputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {

                configLIst.put(entry.getKey().toString(), entry.getValue().toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }


    public static String getConfigValuesFromMap(String key) {
        if (Objects.isNull(key) || Objects.isNull(configLIst.get(key))) {
            throw new RuntimeException("provided key" + key + " " + "not in list");
        }
        return configLIst.get(key);
    }


}
