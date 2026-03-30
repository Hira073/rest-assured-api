package com.zain.api.portfolio.tests;

import com.zain.api.portfolio.base.BaseTest;
import com.zain.api.portfolio.models.LoginRequest;
import com.zain.api.portfolio.utils.TestDataFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AuthApiTests extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void shouldReturnErrorForUnsuccessfulLogin() {
        LoginRequest requestBody = TestDataFactory.invalidLoginWithoutPassword();

        given()
                .spec(requestSpec)
                .body(requestBody)
        .when()
                .post("/login")
        .then()
                .statusCode(400)
                .body("error", equalTo("Missing password"));
    }
}
