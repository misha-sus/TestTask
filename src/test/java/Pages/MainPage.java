package Pages;

import AllSelenide.SelenideDriver;

public class MainPage {
   private final static String MAIN_PAGE_CATALOG = "div.header__nav-element.nav-element > button";
   private final static String FIRST_REQUEST = "//span[@class  = 'goods-name'][1]";
   private final static String PAN = "//span[@data-link ='text{:product^goodsName}']";



   //нажимает на кнопку каталога
    public static void buttonCatalog(){
        SelenideDriver.$(MAIN_PAGE_CATALOG).click();
    }


    //выбираем нужную нам категорию ( мужчинам , женщинам )
    public static void selectionCategory(Category category){
        SelenideDriver.$x( String.format("//ul[@class = 'menu-burger__main-list']/li//a[text() = '%s']",category.nameCatalog)).click();
    }

    //выбираем нужную одежду ( брюки , джинсы )
    public static void selectionClothes(Clothes clothes){
        SelenideDriver.$x( String.format("//a[@class = 'j-menu-item'][text() = '%s']",clothes.nameClothe)).click();
    }
    //нажимает на первый найденную ссылку по данным запроса
    public static void clickFirstFinder (){
        SelenideDriver.$x(FIRST_REQUEST).click();
    }

    //возвращает описание товара
    public static String productDescription (){
        return  SelenideDriver.$x(PAN).getText();
    }

}
