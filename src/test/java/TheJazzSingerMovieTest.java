import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TheJazzSingerMovieTest extends BaseTest{

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
        eventsPage.clickTheJazzSingerMovie();
    }

    @Test
    @Order(3)
    public void saveMovieInfos() {
        moviePage = new MoviePage(driver);
        moviePage.saveTheJazzSingerDirectorsName();
        moviePage.saveTheCircusWritersName();
        moviePage.saveTheJazzSingerStarsName();
    }

    @Test
    @Order(4)
    public void selectSaveMovieInfosFromSearchBox() throws InterruptedException {
        homeSearchPage = new HomeSearchPage(driver);
        homeSearchPage.clickHomeButton();
        Thread.sleep(1000);
        homeSearchPage.searchTheJazzSinger();
        Thread.sleep(1000);
        homeSearchPage.clickTheJazzSingerMovieInSearch();
        moviePage.saveTheJazzSingerDirectorsNameFromSearch();
        moviePage.saveTheJazzSingerWritersNameFromSearch();
        moviePage.saveTheJazzSingerStarsNameFromSearch();
        Assertions.assertEquals(moviePage.saveTheJazzSingerDirectorsName(), moviePage.saveTheJazzSingerDirectorsNameFromSearch(),
                "'Directors' text values not matched!");
        Assertions.assertEquals(moviePage.saveTheJazzSingerWritersName(), moviePage.saveTheJazzSingerWritersNameFromSearch(),
                "'Writers' text values not matched!");
        Assertions.assertEquals(moviePage.saveTheJazzSingerStarsName(), moviePage.saveTheJazzSingerStarsNameFromSearch(),
                "'Stars' text values not matched!");
    }

    @Test
    @Order(5)
    public void controlPhotos() throws IOException {
        photosPage = new PhotosPage(driver);
        photosPage.clickPhotosButtonInTheJazzSingerMovie();
        photosPage.checkLinksHttp();

    }
}
