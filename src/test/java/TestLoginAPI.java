import io.restassured.RestAssured;
import org.example.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.LoginRequestPayload;
import pojo.LoginResponsePayload;

import static io.restassured.RestAssured.given;

public class TestLoginAPI extends Utility {

    @Test
    public void testLogin()
    {
        LoginRequestPayload loginRequestPayload= new LoginRequestPayload();
        loginRequestPayload.setUserEmail("vinit12@gmail.com");
        loginRequestPayload.setUserPassword("Vinit@123");

        LoginResponsePayload loginresponse=given().log().all().spec(baserequestSpecification())
               .body(loginRequestPayload)
               .when().post("/api/ecom/auth/login")
               .then().assertThat().statusCode(200).extract().as(LoginResponsePayload.class);

        Assert.assertEquals(loginresponse.getMessage(), "Login Successfully");



    }
}
