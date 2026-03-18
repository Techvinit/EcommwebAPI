package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Utility {

    public RequestSpecification baserequestSpecification(){

        RequestSpecification baseReq =new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .setContentType("application/json").build();
        return baseReq;
    }
    public RequestSpecification getCourseRequestSpecificaton(){

       RequestSpecification cousespec=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").build();
        return cousespec;

    }


}
