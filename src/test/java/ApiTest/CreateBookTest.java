package ApiTest;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateBookTest {


    @Test(description = "this is to test the valid Create Book",priority=1)

        public void validCreateBook() {
            RestAssured.baseURI = "http://localhost:8080";
            given().urlEncodingEnabled(true)
                    .param("title", "added by rest")
                    .param("year", "1990")
                    .header("Accept", ContentType.JSON.getAcceptHeader())
                    .post("/books")
                    .then().statusCode(302);
        }


    @Test(description = "this is to test invalid Create Book",priority=2)
    public void InvalidCreateBook() {

            RestAssured.baseURI = "http://localhost:8080";
        given().urlEncodingEnabled(true)
                .param("title", "rest")
                .param("year", "19")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .post("/books")
                .then().statusCode(200);

    }

    @Test(description = "this is to test invalid Create Book",priority=3)
    public void ValidEditBook() {

        RestAssured.baseURI = "http://localhost:8080";
        given().urlEncodingEnabled(true)
                .param("id", "20")
                .param("title", "rest edited book")
                .param("year", "1990")
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .post("/books")
                .then().statusCode(302);

    }


    @Test(description = "this is to test Delete Create Book",priority=4)
    public void ValidDeleteBook() {

        RestAssured.baseURI = "http://localhost:8080";
        given().urlEncodingEnabled(true)
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .get("/books/26/delete")
                .then().statusCode(200);

    }





}
