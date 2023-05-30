package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class hardCodedGetAllEmployees {


    String baseURI=RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
    String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ5NDAwMDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDk4MzIwMSwidXNlcklkIjoiNTQzMiJ9.6MFUJAK8S-BPsPl5C_r5YuZZ9O2hYvlncE9-756W27k";
    @Test
    public void CreateEmployee(){
        //prepare the request
        RequestSpecification prepareRequest=given().
                header("Content-Type","application/json").
                header("Authorization",token);

        //hitting End point/send the request
        Response response=prepareRequest.when().get("/getAllEmployees.php");

        //verifying the assertion/get response
        response.then().assertThat().statusCode(200);
        //to print the output in the console
        response.prettyPrint();

        System.out.println("My test case is passed");
    }

}
