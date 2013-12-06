
package net.tecgurus.examples.mb.cxf.s;

import javax.jws.WebService;

@WebService(endpointInterface = "net.tecgurus.examples.mb.cxf.s.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

