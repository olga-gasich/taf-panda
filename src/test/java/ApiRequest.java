import java.util.HashMap;

public class ApiRequest {
    String endPoint = "https://www.panda.by/ajax.php";

    public HashMap<String, String> getHeader(String key, String value) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(key, value);
        return hashMap;
    }
    public String getBody(String email, String password) {
        String body = "check_login=%7B%22login%22%3A%22" + email + "%22%2C%22pass%22%3A%22" + password + "%22%7D";
        return body;
    }
}
