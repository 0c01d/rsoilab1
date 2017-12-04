package rsoitestlab;

import rsoilab.Controller;

import static org.junit.Assert.assertEquals;


public class Test {
    private static Controller controller = new Controller();

   @org.junit.Test
   public void index() {
        assertEquals("RSOI First Lab!", controller.rsoi);
    }

   @org.junit.Test
   public void reverseRequest() {
        assertEquals(controller.reverseRequest("RSOI"), "IOSR");
    }
}

