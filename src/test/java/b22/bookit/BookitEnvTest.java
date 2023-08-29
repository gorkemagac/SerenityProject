package b22.bookit;

import org.junit.jupiter.api.Test;
import utilities.ConfigReader;

public class BookitEnvTest {


    @Test
    public void test1()
    {
        System.out.println(ConfigReader.getProperty("base.url"));
        System.out.println(ConfigReader.getProperty("teacher.username"));
        System.out.println(ConfigReader.getProperty("teacher.password"));
    }
}
