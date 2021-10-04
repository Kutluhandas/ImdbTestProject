import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {

    By menuButtonLocator = By.id("imdbHeader-navDrawerOpen--desktop");
    By oscarsButtonLocator = new By.ByCssSelector("a[href='/oscars/?ref_=nv_ev_acd']");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton(){
        click(menuButtonLocator);
    }

    public void clickOscarsButton(){
        click(oscarsButtonLocator);
    }

}
