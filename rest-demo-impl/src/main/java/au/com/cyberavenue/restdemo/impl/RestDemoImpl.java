package au.com.cyberavenue.restdemo.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.com.cyberavenue.restdemo.api.RestDemoService;
import au.com.cyberavenue.restdemo.model.ToUpperCaseRS;

@Path("/restDemoService")
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
public class RestDemoImpl implements RestDemoService {

	@GET
	@Path("/toUpperCase/{request}")
	@Override
	public ToUpperCaseRS toUpperCase(@PathParam("request") String request) {
		ToUpperCaseRS response = new ToUpperCaseRS();
		response.setOriginalString(request);
		response.setUpperCaseString(request.toUpperCase());
		return response;
	}

}
