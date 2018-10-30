package studenttest;

import base.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetTest extends TestBase {

    @Test
    public void getAllStudentInformation(){
        Response response = given()
                .when()
                .get("/list");
        System.out.println(response.body().prettyPeek());
    }
}
