import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testLogin() {
        ApiRequest apiRequest = new ApiRequest();
        HashMap<String, String> header = apiRequest.getHeader("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        String response = given().headers(header).
        body(apiRequest.getBody("test@test.com", "Blabla")).
        when().post(apiRequest.endPoint).then().extract().asString();
        Document document = Jsoup.parse(response);
        String actual = document.getElementsByTag("body").text();
        System.out.println(actual);
        Assertions.assertEquals("Ooops", actual);
    }
}
