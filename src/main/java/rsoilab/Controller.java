package rsoilab;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    public String rsoi = "RSOI First Lab!";
    private String comment =  "\n \n \n Add /reverse/{text} in url for reverse text.";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return rsoi + comment;
    }

    @RequestMapping(value = "/reverse/{text}", method = RequestMethod.GET)
    public String reverseRequest(@PathVariable("text") String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

