package practice;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P02 extends TestBaseBeforeAfter {

    @Test
            public void test(){
        //Verify that we have pom.xml file in our project => please try in 4 min s
        String dosyamYol = "C:\\techPro\\SeleniumProject\\pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(dosyamYol)));
    }

}
