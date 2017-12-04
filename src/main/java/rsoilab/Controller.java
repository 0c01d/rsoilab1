package rsoilab;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    public String rsoi = "RSOI First Lab!";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return rsoi;
    }

    @RequestMapping(value = "/reverse/{text}", method = RequestMethod.GET)
    public String reverseRequest(@PathVariable("text") String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

