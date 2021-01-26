package BookE2ePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateDeleteBookPage {

    @FindBy(xpath = "/html/body/div/div/div[2]/div/a")
    public WebElement CreateBookBtn ;

    @FindBy(id = "title")
    private WebElement AddBookTitle ;

    @FindBy(id = "year")
    private WebElement AddBookYear ;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div[2]/button[1]")
    private WebElement AddBookSave ;

    @FindBy(xpath = "/html/body/div/div/div[2]/table/tbody/tr[9]/td[1]")
    private WebElement NewBookAdded ;

    @FindBy(xpath = "/html/body/div/div/div[2]/table/tbody/tr[9]/td[4]/a")
    private WebElement NewBookDelete ;





    public CreateDeleteBookPage (WebDriver driver) {

        PageFactory.initElements (driver,this);
        driver.get("http://localhost:8080/books");
    }

    public void ValidCreateBook(){

        this.CreateBookBtn.click();
        this.AddBookTitle.sendKeys("New Book Added");
        this.AddBookYear.sendKeys("1980");
        this.AddBookSave.click();


    }

    public void ValidDeleteBook() {

        this.NewBookAdded.isDisplayed();
        this.NewBookDelete.click();
        Assert.assertTrue(true,NewBookAdded.getText());


    }
}
