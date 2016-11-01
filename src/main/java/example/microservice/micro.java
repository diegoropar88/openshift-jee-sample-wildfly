package example.microservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class micro {

	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
}
