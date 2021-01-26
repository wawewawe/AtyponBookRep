package BookE2eTest;

import BaseTest.BaseTest;
import BookE2ePage.EditBookPage;
import org.testng.annotations.Test;

public class EditBookTest extends BaseTest {

    @Test(description = "this is to test EditBookPage e2e test")

    public void EditBookPage() throws InterruptedException {

        EditBookPage editBookPage = new EditBookPage(driver);
        editBookPage.EditBookAssert();
        editBookPage.ValidEditBook();
        editBookPage.NotValidEditBook();
    }
}
