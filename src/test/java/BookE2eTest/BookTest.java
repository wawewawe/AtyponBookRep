package BookE2eTest;

import BaseTest.BaseTest;
import BookE2ePage.BookPage;
import org.testng.annotations.Test;

public class BookTest extends BaseTest {

    @Test(description="this is to test BookPage e2e test")

    public void BookPage() {

        BookPage bookPage = new BookPage(driver);
        bookPage.HomeAssert();
        bookPage.AssertBooksPage();
    }

}
