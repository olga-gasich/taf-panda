import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PageTest extends BaseTest{

    @Test
    public void testOpenHomePage(){

        page.openBaseURL();
        Assertions.assertEquals("market@panda.by", page.getFooterEmailText());
    }
}
