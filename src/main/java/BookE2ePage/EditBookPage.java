package BookE2ePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class EditBookPage {


private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/h1")
    private WebElement BooksListHeader ;

    @FindBy(xpath = "//*[@id=\"bookForm\"]/h1")
    private WebElement EditBooksHeader ;

    @FindBy(id = "title")
    private WebElement EditBookTitle ;

    @FindBy(id = "year")
    private WebElement EditBookYear ;

    @FindBy(xpath = "//*[@id=\"bookForm\"]/div[2]/button[1]")
    private WebElement EditBookSave ;

    @FindBy(id = "btn-clear")
    private WebElement EditBookClear ;

    @FindBy(xpath = "//*[@id=\"bookForm\"]/div[1]/div[1]/span")
    private WebElement ErrorEditBook ;

    @FindBy(xpath = "/html/body/div/div/div[2]/table/tbody/tr[8]/td[3]/a")
    private WebElement EditBookBtn ;

    @FindBy(xpath ="/html/body/div/div/div[2]/table/tbody/tr[8]/td[1]" )
    private WebElement ActualEditLabel;

    @FindBy(xpath ="//*[@id=\"bookForm\"]/div[1]/div[1]/span" )
    private WebElement ActualErrorMsg;

    @FindBy(xpath ="/html/body/div/div/div[2]/table/tbody/tr[8]/td[4]/a" )
    private WebElement DeleteBtn;

    private WebDriverWait WebDriverWait;


    public EditBookPage (WebDriver driver) {

        PageFactory.initElements (driver,this);
        driver.get("http://localhost:8080/books");
    }

    public void EditBookAssert () {
        this.EditBookBtn.click();
        this.EditBooksHeader.isDisplayed();
        this.EditBookTitle.isEnabled();
        this.EditBookYear.isEnabled();
        this.EditBookSave.isEnabled();
        this.EditBookClear.isEnabled();

    }

    public void ValidEditBook (){

        this.EditBookTitle.clear();
        this.EditBookYear.clear();
        this.EditBookTitle.sendKeys("new book edited");
        this.EditBookYear.sendKeys("1990");
        this.EditBookSave.click();
        this.BooksListHeader.isDisplayed();
        String EditLable = "new book edited";
        Assert.assertEquals(EditLable,ActualEditLabel.getText());

    }

    public void NotValidEditBook (){


        this.EditBookBtn.click();
        this.EditBookTitle.clear();
        this.EditBookYear.clear();
        this.EditBookSave.click();
        String ExpectedErrorMsg = "Title should have at least 8 characters";
        Assert.assertEquals(ExpectedErrorMsg,ActualErrorMsg.getText());


    }

    public void DeleteBook (){


        this.EditBookBtn.click();
        this.EditBookTitle.clear();
        this.EditBookYear.clear();
        this.EditBookSave.click();
        String ExpectedErrorMsg = "Title should have at least 8 characters";
        Assert.assertEquals(ExpectedErrorMsg,ActualErrorMsg.getText());


    }

}
