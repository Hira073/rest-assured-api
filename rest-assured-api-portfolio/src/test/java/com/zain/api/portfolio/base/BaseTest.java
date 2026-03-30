package com.zain.api.portfolio.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification requestSpec;

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://reqres.in";

        requestSpec = new RequestSpecBuilder()
                .setBaseUri(RestAssured.baseURI)
                .setBasePath("/api")
                .setContentType(ContentType.JSON)
                .addHeader("x-api-key", "reqres-free-v1")
                .build();
    }
}
