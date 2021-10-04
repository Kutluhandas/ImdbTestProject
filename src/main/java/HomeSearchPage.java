import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSearchPage extends BasePage {

    By homeButtonLocator = By.id("home_img_holder");
    By searchButtonLocator = new By.ByCssSelector("input[aria-controls='react-autowhatever-1']");
    By theCircusMovieInSearchButtonLocator = new By.ByCssSelector("a[href='/title/tt0018773?ref_=nv_sr_srsg_3']");
    By theJazzSingerMovieInSearchButtonLocator = new By.ByCssSelector("a[href='/title/tt0018037?ref_=nv_sr_srsg_2']");

    public HomeSearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickHomeButton(){
        click(homeButtonLocator);
    }

    public void searchTheCircus(){
        typeSearch(searchButtonLocator, "The Circus");
    }

    public void searchTheJazzSinger(){
        typeSearch(searchButtonLocator, "The Jazz Singer");
    }

    public void clickTheCircusMovieInSearch(){
        click(theCircusMovieInSearchButtonLocator);
    }

    public void clickTheJazzSingerMovieInSearch(){click(theJazzSingerMovieInSearchButtonLocator);}

}
