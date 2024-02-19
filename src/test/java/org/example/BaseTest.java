package org.example;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.utils.Config;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class BaseTest {
    RequestSpecification baseSpecification = given()
            .log().body()
            .baseUri(Config.getProperty("URL"));

    ResponseSpecification statusCode = expect()
            .statusCode(Integer.parseInt(Config.getProperty("statusOK")));

}
