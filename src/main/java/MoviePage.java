import org.junit.jupiter.api.Tags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage extends BasePage {

    //These locators are same but i used again to be more understandable.
    By infosTextTheCircusMovieListLocator = new By.ByCssSelector("ul[class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt']");
    By infosTextTheCircusMovieListInSearchWayLocator = new By.ByCssSelector("ul[class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt']");

    //These locators are same also.
    By infosTextTheJazzSingerMovieListLocator = new By.ByCssSelector("div[class='ipc-metadata-list-item__content-container']");
    By infosTextTheJazzSingerMovieListInSearchLocator = new By.ByCssSelector("div[class='ipc-metadata-list-item__content-container']");


    public MoviePage(WebDriver driver) {
        super(driver);
    }


    public String saveTheCircusDirectorsName(){
        return saveInList(infosTextTheCircusMovieListLocator,0);
    }
    public String saveTheCircusDirectorsNameFromSearch(){
        return saveInList(infosTextTheCircusMovieListInSearchWayLocator,0);
    }

    public String saveTheCircusWritersName(){
        return saveInList(infosTextTheCircusMovieListLocator,1);
    }
    public String saveTheCircusWritersNameFromSearch(){
        return saveInList(infosTextTheCircusMovieListInSearchWayLocator,1);
    }

    public String saveTheCircusStarsName(){return saveInList(infosTextTheCircusMovieListLocator,2);}
    public String saveTheCircusStarsNameFromSearch(){return saveInList(infosTextTheCircusMovieListInSearchWayLocator,2);}


    public String saveTheJazzSingerDirectorsName(){
        return saveInList(infosTextTheJazzSingerMovieListLocator,0);
    }
    public String saveTheJazzSingerDirectorsNameFromSearch(){
        return saveInList(infosTextTheJazzSingerMovieListInSearchLocator,0);
    }

    public String saveTheJazzSingerWritersName(){
        return saveInList(infosTextTheJazzSingerMovieListLocator,1);
    }
    public String saveTheJazzSingerWritersNameFromSearch(){
        return saveInList(infosTextTheJazzSingerMovieListInSearchLocator,1);
    }

    public String saveTheJazzSingerStarsName(){return saveInList(infosTextTheJazzSingerMovieListLocator,2);}
    public String saveTheJazzSingerStarsNameFromSearch(){return saveInList(infosTextTheJazzSingerMovieListInSearchLocator,2);}


}
