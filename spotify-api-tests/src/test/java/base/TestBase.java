package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

import java.util.Properties;
import java.io.FileInputStream;

public class TestBase {

    protected Properties config;

    @BeforeClass
    public void setup() throws Exception {
        config = new Properties();
        config.load(new FileInputStream("src/test/resources/config.properties"));

        RestAssured.baseURI = config.getProperty("base.url");
    }

    protected String getToken() {
        return "Bearer " + config.getProperty("token");
    }
}
