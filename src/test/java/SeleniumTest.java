
import AllSelenide.SelenideDriver;

import Pages.Category;
import Pages.Clothes;
import Pages.MainPage;
import org.junit.jupiter.api.*;



public class SeleniumTest {
    //сайт wildberries
    final static String URL = "https://www.wildberries.ru/";


    @BeforeEach
    void start() {
        SelenideDriver.open(URL);
    }

    @Test
    void selectedItemWithRequest() {

        //нажать на кнопку каталог
        MainPage.buttonCatalog();
        //выбрать нужную категорию
        MainPage.selectionCategory(Category.MEN);
        //выбрать нужную одежду
        MainPage.selectionClothes(Clothes.JEANS);
        //нажать на первый запрос
        MainPage.clickFirstFinder();
        // сранить что в описании есть название выбранной одежды
        Assertions.assertTrue(MainPage.productDescription().contains(Clothes.JEANS.nameClothe));

    }
}

