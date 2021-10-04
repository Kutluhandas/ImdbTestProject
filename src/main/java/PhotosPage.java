import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PhotosPage extends BasePage{

    By photosButtonInTheCircusMovieLocator = new By.ByCssSelector("a[href='/title/tt0018773/mediaindex/?ref_=tt_mi_sm']");
    By photosButtonInTheJazzSingerMovieLocator = new By.ByCssSelector("a[href='/title/tt0018037/mediaindex/?ref_=tt_mi_sm']");
    By nextButtonInListLocator = new By.ByCssSelector("a[class='prevnext']");

    By allLinksLocator = By.tagName("img");

    public PhotosPage(WebDriver driver) {
        super(driver);
    }

    public void clickPhotosButtonInTheCircusMovie(){
        click(photosButtonInTheCircusMovieLocator);
    }

    public void clickPhotosButtonInTheJazzSingerMovie(){
        click(photosButtonInTheJazzSingerMovieLocator);
    }

    public void clickNextButton(){
        clickInList(nextButtonInListLocator,0);
    }

    public void checkLinksHttp() throws IOException {
        loop(allLinksLocator);
    }

}
