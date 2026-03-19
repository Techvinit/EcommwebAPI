package org.example;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
public class AddProduct extends Utility {

@Test
    public void createProduct(){

    File productImage= new File("C://Users//vinit//Downloads//aaaaaaaa.jpg");
    Response createprodRes =given()
            .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2M2JiYjZiNjU2OGMzZTlmYjFmMGViMjgiLCJ1c2VyRW1haWwiOiJ2aW5pdDEyQGdtYWlsLmNvbSIsInVzZXJNb2JpbGUiOjk4MzQxNjYxNDgsInVzZXJSb2xlIjoiY3VzdG9tZXIiLCJpYXQiOjE3NzM5NDIxNjgsImV4cCI6MTgwNTQ5OTc2OH0.iLLMouPYc20d8_93WBIMjBuM7Xo1kr30vE77op3JXN8") // your token
            .multiPart("productName", "Trimmer")
            .multiPart("productAddedBy", "63bbb6b6568c3e9fb1f0eb28")
            .multiPart("productCategory", "Electronics")
            .multiPart("productSubCategory", "Computer")
            .multiPart("productPrice", "900")
            .multiPart("productDescription", "Grooming")
            .multiPart("productFor", "Men")
            .multiPart("productImage", productImage) // attach file
            .when()
            .post("https://rahulshettyacademy.com/api/ecom/product/add-product")
            .then()
            .extract()
            .response();

          System.out.println(createprodRes.asString());
}

}
