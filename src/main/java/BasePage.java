import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> selectRequestOne(By locator){return driver.findElements(locator);}

    public List<WebElement> links(By locator){return driver.findElements(locator);}


    public void click(By locator) {
        find(locator).click();
    }

    public void typeSearch(By locator , String text){
        find(locator).sendKeys(text);
    }

    public void clickInList(By locator, int i){
        selectRequestOne(locator).get(i).click();
    }

    public String saveInList(By locator, int i){
        return selectRequestOne(locator).get(i).getText();
    }

    public void loop(By locator) throws IOException {
        for(WebElement el : links(locator)){
            String url = el.getAttribute("src");
            verifyLinks(url);
        }
    }

    private void verifyLinks(String url) throws IOException {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(5000);
            conn.connect();

            int status = conn.getResponseCode();
            String message = conn.getResponseMessage();

            if(status >= 400){
                System.out.println(url + " - broken" + " " + status + " " + message);
            }else{
                System.out.println(url + " - working" + " " + status + " " + message);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
