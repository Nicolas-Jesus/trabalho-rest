package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path ("/imc")
public class Imc {

	@GET
	@Produces("text/plain")

public float imc(@QueryParam("peso") float peso, @QueryParam("altura") float altura) {
		
		float imc;
		
		imc = peso / (altura*altura);
		
		return imc	;
	}
}
