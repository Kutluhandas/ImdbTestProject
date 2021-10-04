import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventsPage extends BasePage {

    By yearButtonLocator = new By.ByCssSelector("a[href= '/event/ev0000003/1929/1/?ref_=acd_eh']");
    By theCircusMovieButtonInList = new By.ByCssSelector("a[href='/title/tt0018773/?ref_=ev_nom']");
    By theJazzSingerMovieButtonInList = new By.ByCssSelector("a[href='/title/tt0018037/?ref_=ev_nom']");

    public EventsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNineteenTwentyOneButton(){
        click(yearButtonLocator);
    }

    public void clickTheCircusMovie(){
        clickInList(theCircusMovieButtonInList,0);
    }

    public void clickTheJazzSingerMovie(){
        clickInList(theJazzSingerMovieButtonInList, 4);
    }


}
