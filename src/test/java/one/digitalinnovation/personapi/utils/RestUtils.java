package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class RestUtils {

    // Attributes
    static String uriPersonApi = "http://localhost:8080/api/v1/people";

    // Methods
    public static long getIdByMessage(String msg){
        // get number from response
        int _lastIndex = msg.lastIndexOf(' ') + 1;
        String _idStr = msg.substring(_lastIndex);

        long id = Long.parseLong(_idStr);

        return id;
    }

    // Tests
    // post method returns the person id in database
    public static long PostPerson(PersonDTO pessoa) throws IOException {
        String uriPost = uriPersonApi;

        String response =
                given()
                        .contentType("application/json")
                        .log().all()
                        .body(pessoa)
                        .when()
                        .post(uriPost)
                        .then()
                        .log().all()
                        .statusCode(201)
                        .extract().path("message")
                ;


        return getIdByMessage(response);

    }

    static public void GetPersonById(PersonDTO pessoa, long id) throws IOException {
        String uriGetPersonById = uriPersonApi + "/" + id;

        given()
                .contentType("application/json")
                .log().all()
                .when()
                .get(uriGetPersonById)
                .then()
                .log().all()
                .statusCode(200)
                .body("id", is((int) id))
                .body("firstName", is(pessoa.getFirstName()))
        ;

    }

    static public void GetAllPersons() throws IOException {
        String uriGetPersonById = uriPersonApi;

        given()
                .contentType("application/json")
                .log().all()
                .when()
                .get(uriGetPersonById)
                .then()
                .log().all()
                .statusCode(200)
        ;

    }

    static public void RemovePersonById(long id) throws IOException {
        String uriRemovePersonById = uriPersonApi + '/' + id;

        given()
                .contentType("application/json")
                .log().all()
                .body(id)
                .when()
                .delete(uriRemovePersonById)
                .then()
                .log().all()
                .statusCode(204)
        ;

    }

}
