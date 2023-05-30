package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

     @FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HardCodedExample {

    String baseURI=RestAssured.baseURI="http://hrm.syntaxtechs.net/syntaxapi/api";
    String token="Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODUwMjMzMDYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NTA2NjUwNiwidXNlcklkIjoiNTQzMiJ9.bLGEOAMcZn9wSwKADfD_ITN5tS6k0qMbEcp2oeutqmw";

    static String employee_id;
    @Test
    public void b_GetCreatedEmployee(){
       //prepare the request
        RequestSpecification prepareRequest=given().
                header("Content-Type","application/json").
                header("Authorization",token).
                queryParam("employee_id",employee_id);

        //hitting End point/send the request
        Response response=prepareRequest.when().get("/getOneEmployee.php");

        //to print the output in the console
        response.prettyPrint();

        //verifying the assertion/get response
        response.then().assertThat().statusCode(200);

        String temEmpId=response.jsonPath().getString("employee.employee_id");

        //we have 2 emp id, one is global and second is local
        Assert.assertEquals(employee_id, temEmpId);
    }
    @Test
    public void a_CreateEmployee(){
        //prepare the request
        RequestSpecification prepareRequest=given().
                header("Content-Type","application/json").
                header("Authorization",token).
                body("{\n" +
                        "  \"emp_firstname\": \"timojado\",\n" +
                        "  \"emp_lastname\": \"Dayoub\",\n" +
                        "  \"emp_middle_name\": \"Rami\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2003-01-31\",\n" +
                        "  \"emp_status\": \"active\",\n" +
                        "  \"emp_job_title\": \"Engineer\"\n" +
                        "}");

        //hitting End point/send the request
        Response response=prepareRequest.when().post("/createEmployee.php\n");

        //verifying the assertion/get response
        response.then().assertThat().statusCode(201);
        //to print the output in the console
        response.prettyPrint();

        employee_id=response.jsonPath().getString("Employee.employee_id");
        System.out.println(employee_id);

        //verifying the firstname in the response body
        response.then().assertThat().
                body("Employee.emp_firstname", equalTo("timojado"));

        response.then().assertThat().
                body("Employee.emp_lastname", equalTo("Dayoub"));

        response.then().assertThat().
                body("Employee.emp_birthday", equalTo("2003-01-31"));

        //verify the response header (from console)

        response.then().assertThat().header("Content-Type","application/json");


        System.out.println("My test case is passed");
    }

         @Test
         public void c_updateEmployee(){
             RequestSpecification preparedRequest = given().
                     header("Content-Type","application/json").
                     header("Authorization", token).
                     body("{\n" +
                             "  \"employee_id\": \""+employee_id+"\",\n" +
                             "  \"emp_firstname\": \"Sawsan\",\n" +
                             "  \"emp_lastname\": \"Takla\",\n" +
                             "  \"emp_middle_name\": \"Munif\",\n" +
                             "  \"emp_gender\": \"F\",\n" +
                             "  \"emp_birthday\": \"2003-05-20\",\n" +
                             "  \"emp_status\": \"probation\",\n" +
                             "  \"emp_job_title\": \"CEO\"\n" +
                             "}");

             //hitting the endpoint
             Response response = preparedRequest.when().put("/updateEmployee.php");
             response.then().assertThat().statusCode(200);
             //for verification
             response.then().assertThat().body("Message", equalTo("Employee record Updated"));
         }

         @Test
         public void d_getUpdatedEmployee(){
             RequestSpecification preparedRequest = given().
                     header("Content-Type","application/json").
                     header("Authorization", token).
                     queryParam("employee_id",employee_id);

             Response response = preparedRequest.when().get("/getOneEmployee.php");
             response.prettyPrint();
             response.then().assertThat().statusCode(200);
             //if you want to verify the body of the response.
             //you can do that using hamcrest matchers

         }


     }


