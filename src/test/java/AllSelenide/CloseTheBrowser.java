package AllSelenide;

import org.junit.jupiter.api.extension.*;
//этот класс не использую
public class CloseTheBrowser implements BeforeEachCallback
{
    @RegisterExtension
     SelenideDriver selenideDriver = new SelenideDriver();


    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {

    }
}
