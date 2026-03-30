package com.zain.api.portfolio.tests;

import com.zain.api.portfolio.base.BaseTest;
import com.zain.api.portfolio.models.CreateUserRequest;
import com.zain.api.portfolio.utils.TestDataFactory;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class UserApiTests extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void shouldGetSingleUserSuccessfully() {
        given()
                .spec(requestSpec)
        .when()
                .get("/users/2")
        .then()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"))
                .body("support.url", notNullValue());
    }

    @Test(groups = {"regression"})
    public void shouldValidateUsersListPagination() {
        given()
                .spec(requestSpec)
                .queryParam("page", 2)
        .when()
                .get("/users")
        .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("per_page", equalTo(6))
                .body("data.size()", equalTo(6));
    }

    @Test(groups = {"smoke", "regression"})
    public void shouldCreateUserSuccessfully() {
        CreateUserRequest requestBody = TestDataFactory.newUser();

        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
        .when()
                .post("/users")
        .then()
                .statusCode(201)
                .body("name", equalTo(requestBody.getName()))
                .body("job", equalTo(requestBody.getJob()))
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract()
                .response();

        Assert.assertNotNull(response.jsonPath().getString("id"), "Created user id should not be null");
    }

    @Test(groups = {"regression"})
    public void shouldUpdateUserSuccessfully() {
        CreateUserRequest requestBody = TestDataFactory.updatedUser();

        given()
                .spec(requestSpec)
                .body(requestBody)
        .when()
                .put("/users/2")
        .then()
                .statusCode(200)
                .body("name", equalTo(requestBody.getName()))
                .body("job", equalTo(requestBody.getJob()))
                .body("updatedAt", notNullValue());
    }
}
