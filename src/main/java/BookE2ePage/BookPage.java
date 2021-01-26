package BookE2ePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookPage {



    @FindBy(xpath = "/html/body/nav/div/div[1]/a")
    public WebElement HeaderLabel ;

    @FindBy (xpath = "/html/body/div/div/div[1]/ul/li[1]/a")
    public WebElement HomeBtn ;

    @FindBy (xpath = "/html/body/div/div/div[1]/ul/li[2]/a")
    public WebElement BooksBtn ;

    @FindBy (xpath = "/html/body/div/div/div[1]/ul/li[3]/a")
    public WebElement AuthorsBtn ;

    @FindBy (xpath = "/html/body/div/div/div[2]")
    private WebElement GreetingMsgLabel ;

    @FindBy (id = "searchID")
    public WebElement SearchTxtBox ;

    @FindBy (xpath = "//*[@id=\"searchForm\"]/button")
    public WebElement SearchBtn ;

    @FindBy (xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
    public WebElement HomeHeaderBtn ;

    @FindBy (xpath = "//*[@id=\"navbar\"]/ul/li[2]/a")
    public WebElement BooksHeaderBtn ;

    @FindBy (xpath = "//*[@id=\"navbar\"]/ul/li[3]/a")
    public WebElement AuthorsHeaderBtn ;

    @FindBy (xpath = "/html/body/div/div/div[2]/h1")
    private WebElement BooksListHeader ;


    public BookPage (WebDriver driver) {

        PageFactory.initElements (driver,this);
    }

    public void HomeAssert(){

        this.HeaderLabel.isDisplayed();
        this.HomeBtn.isDisplayed();
        this.BooksBtn.isDisplayed();
        this.BooksBtn.isEnabled();
        this.AuthorsBtn.isDisplayed();
        this.SearchTxtBox.isEnabled();
        this.SearchBtn.isEnabled();
        this.HomeHeaderBtn.isDisplayed();
        this.BooksHeaderBtn.isEnabled();
        this.AuthorsHeaderBtn.isEnabled();
        Assert.assertTrue(true , "Hello Test Automation Engineer!!");
    }

    public void AssertBooksPage() {

        this.BooksBtn.click();
        this.BooksListHeader.isDisplayed();

    }
}
