package com.ultimateqa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Utility class for reading properties from a configuration file.
 */
public class PropertiesReader {

    // Properties object to store configuration settings
    public static Properties config = new Properties();

    /**
     * Reads the properties from the configuration file.
     *
     * @return Properties object containing the configuration settings.
     */
    public static Properties readProp() {
        FileInputStream fis = null;

        try {
            // Load configuration properties from the file
            fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/Config.properties");
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            // log.warn(e.getMessage());// added for logging
        }

        return config;
    }

    /**
     * Retrieves the value of the specified property from the configuration file.
     *
     * @param prop The name of the property to retrieve.
     * @return The value of the specified property.
     */
    public static String getPropertyValue(String prop) {
        String propertyValue = null;

        try {
            // Retrieve property value from the configuration
            propertyValue = readProp().getProperty(prop);

            // Check if the property value is empty
            if (propertyValue.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // log.info(e.getMessage() + " for property: " + prop);// added for logging
        }

        return propertyValue;
    }
}

