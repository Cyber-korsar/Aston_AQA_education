package org.example;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class PostmanTest extends BaseTest {

@Test
public void postmanTest(){
    get();
    post();
    put();
    patch();
    delete();
    }

    private void post() {
        Person person = new Person(1, "Mike");
        baseSpecification
                .given()
                .log()
                .body()
                .contentType("application/json")
                .body(person)
                .when().post("/post")
                .then().log().body()
                .spec(statusCode)
                .body("json.name", equalTo(person.getName()))
                .body("json.id", equalTo(person.getId()));
        // System.out.println(a);
    }

    private void get() {
        Person person = new Person(1, "Mike");
        baseSpecification
                .given()
                .contentType("application/json")
                .body(person.toJson())
                .when()
                .get("/get")
                .then()
                .log()
                .body()
                .spec(statusCode);
//                .and().body("name",equalTo(person.getName())); //не работает нужна помощь в понятии почему, делал исходя из методички

    }

    private void put() {
        Person person = new Person(1, "Mike");
        baseSpecification
                .given()
                .contentType("application/json")
                .body(person.toJson())
                .when()
                .put("/put")
                .then()
                .log()
                .body()
                .spec(statusCode)
                .body("json.name", equalTo(person.getName()))
                .body("json.id", equalTo(person.getId()));
    }
    private void patch() {
        Person person = new Person(1, "Mike");
        baseSpecification
                .given()
                .contentType("application/json")
                .body(person.toJson())
                .when()
                .patch("/patch")
                .then()
                .log()
                .body()
                .spec(statusCode)
                .body("json.name", equalTo(person.getName()))
                .body("json.id", equalTo(person.getId()));

    }

        public void delete() {
        Person person = new Person(1, "Mike");
        baseSpecification
                .given()
                .contentType("application/json")
                .body(person.toJson())
                .when()
                .delete("/delete")
                .then()
                .log()
                .body()
                .spec(statusCode)
                .body("json.name", equalTo(person.getName()))
                .body("json.id", equalTo(person.getId()));
    }
}