package Emag.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {
    @FindBy(css = " div.navbar-branding > a > img")
    private WebElementFacade emagLogo;



    public boolean checkHeaderImage(){
        shouldBeVisible(emagLogo);
        return true;
    }
















}
