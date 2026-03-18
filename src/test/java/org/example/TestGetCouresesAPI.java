package org.example;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.GetCoursesResponsePayload;
import static io.restassured.RestAssured.given;

public class TestGetCouresesAPI extends Utility {


  @Test
    public void testGetcourseAPI(){

      GetCoursesResponsePayload coursesResponsePayload = new GetCoursesResponsePayload();
      GetCoursesResponsePayload res=given().log().all().spec(getCourseRequestSpecificaton())
              .queryParam("access_token", "COpwyW2y1sRon9/sMgR0Sg==")
              .when().get("/oauthapi/getCourseDetails")
              .then().extract().response().as(GetCoursesResponsePayload.class);



  }

}
