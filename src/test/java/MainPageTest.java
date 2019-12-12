
import Utilities.Log;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MainPageTest extends BaseTest {

    @Test
    public void openMainPage(Method method){
        Log.info(method.getName() + " Открывается страница otus");
    }
}
