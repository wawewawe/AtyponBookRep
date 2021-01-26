package BookE2eTest;

import BaseTest.BaseTest;
import BookE2ePage.CreateDeleteBookPage;
import BookE2ePage.EditBookPage;
import org.testng.annotations.Test;

public class CreateDeleteBookTest extends BaseTest {

    @Test(description = "this is to test CreateDeleteBook e2e test")

    public void CreateDeleteBookPage()  {

        CreateDeleteBookPage createDeleteBookPage = new CreateDeleteBookPage(driver);
        createDeleteBookPage.ValidCreateBook();
        createDeleteBookPage.ValidDeleteBook();
    }

}
