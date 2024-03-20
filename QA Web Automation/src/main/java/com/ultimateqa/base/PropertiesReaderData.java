package com.ultimateqa.base;

//Properties Reader class
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.Properties;

	/**
	 * Utility class for reading properties from configuration and data files.
	 */
	public class PropertiesReaderData {

	    // Properties object to store configuration settings
	    public static Properties dataFile = new Properties();

	    /**
	     * Reads the properties from the configuration file.
	     *
	     * @return Properties object containing the configuration settings.
	     */
	    public static Properties readProp() {
	        FileInputStream fis = null;
	        try {
	            fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/Config.properties");
	            dataFile.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	            // log.warn(e.getMessage());// added for logging
	        }
	        return dataFile;
	    }

	    /**
	     * Reads the properties from the specified data file.
	     *
	     * @param fileName The name of the data file to read.
	     * @return Properties object containing the data file settings.
	     */
	    public static Properties readPropFromData(String fileName) {
	        FileInputStream fis = null;
	        try {
	            fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data/" + fileName + ".properties");
	            dataFile.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	            // log.warn(e.getMessage());// added for logging
	        }
	        return dataFile;
	    }

	    /**
	     * Retrieves the value of the specified property from the configuration file.
	     *
	     * @param prop The name of the property to retrieve.
	     * @return The value of the specified property.
	     */
	    public static String getPropertyValueFromData(String prop) {
	        String propertyValue = null;
	        try {
	            propertyValue = readProp().getProperty(prop).toLowerCase();
	            if (propertyValue.isEmpty()) {
	                throw new NullPointerException();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            // log.info(e.getMessage() + " for property: " + prop);// added for logging
	        }
	        return propertyValue;
	    }

	    /**
	     * Retrieves the value of the specified property from the configuration file.
	     * This method is case-insensitive and converts the property value to lowercase.
	     *
	     * @param prop The name of the property to retrieve.
	     * @return The value of the specified property (in lowercase).
	     */
	    public static String getPropertyValue(String prop) {
	        String propertyValue = null;
	        try {
	            propertyValue = readProp().getProperty(prop).toLowerCase();
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

