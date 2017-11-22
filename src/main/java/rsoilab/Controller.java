package rsoilab;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.catalina.util.MIME2Java.reverse;

@RestController
public class Controller {

 public String hello = "Hello World!";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return hello;
    }

    @RequestMapping(value = "/reverse/{text}", method = RequestMethod.GET)
    public String reverseRequest(@PathVariable("text") String text) {
        		return reverse(text);
        	}

    String reverse(String text) {
        	return new StringBuilder(text).reverse().toString();
        	}
}
