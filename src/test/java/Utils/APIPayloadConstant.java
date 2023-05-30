package Utils;

import APIStepDefinitions.APIWorkflowSteps;
import org.json.JSONObject;

public class APIPayloadConstant {

    public static String createEmployeePayload(){
        String createEmployeePayload =
                "{\n" +
                        "  \"emp_firstname\": \"Rami\",\n" +
                        "  \"emp_lastname\": \"Dayoub\",\n" +
                        "  \"emp_middle_name\": \"Georges\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"2003-01-01\",\n" +
                        "  \"emp_status\": \"confirmed\",\n" +
                        "  \"emp_job_title\": \"QA Engineer\"\n" +
                        "}";
        return createEmployeePayload;
    }

    public static String createEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "Rami");
        obj.put("emp_lastname", "Dayoub");
        obj.put("emp_middle_name", "Georges");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "2003-01-01");
        obj.put("emp_status", "confirmed");
        obj.put("emp_job_title","QA Engineer");
        return obj.toString();
    }

    public static String createEmployeePayloadDynamic(String firstname, String lastname, String middlename,
                                                      String gender, String dob,
                                                      String empStatus, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", firstname);
        obj.put("emp_lastname", lastname);
        obj.put("emp_middle_name", middlename);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status", empStatus);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }


    public static String updateEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("employee_id", GlobalVariables.tabledata.get(0).get("employee_id"));
        //obj.put("employee_id", "57610A");
        obj.put("emp_firstname","TimoJado");
        obj.put("emp_lastname","Dayouboo");
        obj.put("emp_middle_name","Ramiii");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","2000-01-01");
        obj.put("emp_status","Probation");
        obj.put("emp_job_title","Manager");
        return obj.toString();
    }

    public static String adminPayload(){
        String adminPayload =
                "{\n" +
                        "  \"email\": \"abcdefg0123@test.com\",\n" +
                        "  \"password\": \"test12345\"\n" +
                        "}";
        return adminPayload;
    }


}