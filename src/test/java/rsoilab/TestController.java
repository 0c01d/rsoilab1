package rsoilab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Controller controller = new Controller();

    @Test
    void getText() {
        assertEquals("RSOI First Lab!", controller.rsoi);
    }

    @Test
    void reverse() {
        assertEquals(controller.reverseRequest("RSOI"), "IOSR");
    }
}
