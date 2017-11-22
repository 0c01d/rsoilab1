package rsoilab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Controller controller = new Controller();

    @Test
    void getHello() {
        assertEquals("Hello World!", controller.hello);
    }

    @Test
    void reverseTest() {
        assertEquals(controller.reverse("abc"), "cba");
        assertEquals(controller.reverse("Hello, world!"), "!dlrow ,olleH");
    }
}
