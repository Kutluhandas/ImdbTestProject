import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TheCircusMovieTest extends BaseTest {

    MenuPage menuPage;
    EventsPage eventsPage;
    MoviePage moviePage;
    HomeSearchPage homeSearchPage;
    PhotosPage photosPage;

    @Test
    @Order(1)
    public void selectMenu() throws InterruptedException {
        menuPage = new MenuPage(driver);
        menuPage.clickMenuButton();
        Thread.sleep(1000);
        menuPage.clickOscarsButton();
    }

    @Test
    @Order(2)
    public void selectNineteenTwentyNine(){
        eventsPage = new EventsPage(driver);
        eventsPage.clickNineteenTwentyOneButton();
        eventsPage.clickTheCircusMovie();
    }

    @Test
    @Order(3)
    public void saveMovieInfos() {
        moviePage = new MoviePage(driver);
        moviePage.saveTheCircusDirectorsName();
        moviePage.saveTheCircusWritersName();
        moviePage.saveTheCircusStarsName();
    }

    @Test
    @Order(4)
    public void selectSaveMovieInfosFromSearchBox() throws InterruptedException {
        homeSearchPage = new HomeSearchPage(driver);
        homeSearchPage.clickHomeButton();
        Thread.sleep(1000);
        homeSearchPage.searchTheCircus();
        Thread.sleep(1000);
        homeSearchPage.clickTheCircusMovieInSearch();
        moviePage.saveTheCircusDirectorsNameFromSearch();
        moviePage.saveTheCircusWritersNameFromSearch();
        moviePage.saveTheCircusStarsNameFromSearch();
        Assertions.assertEquals(moviePage.saveTheCircusDirectorsName(), moviePage.saveTheCircusDirectorsNameFromSearch(),
                "'Directors' text values not matched!");
        Assertions.assertEquals(moviePage.saveTheCircusWritersName(), moviePage.saveTheCircusWritersNameFromSearch(),
                "'Writers' text values not matched!");
        Assertions.assertEquals(moviePage.saveTheCircusStarsName(), moviePage.saveTheCircusStarsNameFromSearch(),
                "'Stars' text values not matched!");
    }

    @Test
    @Order(5)
    public void controlPhotos() throws IOException, InterruptedException {
        photosPage = new PhotosPage(driver);
        photosPage.clickPhotosButtonInTheCircusMovie();
        photosPage.checkLinksHttp();
        Thread.sleep(1000);
        photosPage.clickNextButton();
        photosPage.checkLinksHttp();
    }
}


