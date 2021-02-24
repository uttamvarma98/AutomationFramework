package swagLabsPackage;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestDataOfSwagLabs extends BrowserSetUp {
    String username,password;
    @BeforeMethod
    public void readPropertiesFile() throws IOException {
        FileInputStream fis=new FileInputStream("resources/config.properties");
        Properties properties=new Properties();
        properties.load(fis);

        username=properties.getProperty("username");
        password=properties.getProperty("password");
    }
}
