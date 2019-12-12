import Utilities.Log;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;

public class BaseTest {

    public String baseUrl = "https://otus.ru/";

    @BeforeClass()
    public void setUpMainClass() {
        Log.startLog();
        WebDriverManager.chromedriver().setup();
        Selenide.open(baseUrl);
    }
    @AfterMethod
    void finishMethod(){
        Selenide.close();
        Log.endLog();

    }


}
