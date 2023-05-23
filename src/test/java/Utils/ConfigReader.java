package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
static Properties pro;
    public static Properties readProperties(){
        try {
         //   FileInputStream file=new FileInputStream("C:\\Users\\ramid\\IdeaProjects\\CucumberBatch15\\src\\test\\resources\\Config\\config.properties");
          // OR :
            FileInputStream file=new FileInputStream(Constants.PROPERTY_FILE_PATH);
             pro=new Properties();
             pro.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return pro;
    }

    public static String getPropertyValue(String propKey){
       return pro.getProperty(propKey);
    }
}
