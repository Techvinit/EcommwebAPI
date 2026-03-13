import io.restassured.RestAssured;
import pojo.LoginRequestPayload;

import static io.restassured.RestAssured.given;

public class TestLoginAPI {

    public static void main(String[] args)
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        LoginRequestPayload loginRequestPayload= new LoginRequestPayload();
        loginRequestPayload.setUserEmail("vinit12@gmail.com");
        loginRequestPayload.setUserPassword("Vinit@123");

        String loginresponse=given().log().all()
                .header("Content-Type", "application/json")
               .body(loginRequestPayload)
               .when().post("/api/ecom/auth/login")
               .then().assertThat().statusCode(200).extract().response().asString();

       System.out.println(loginresponse);
    }
}
