package ir.mousavi.training.Service;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/test")
public class TestService {

    @GET
    @Produces("text/plain;charset=UTF-8")
    @Path("/sayHello")
    @RolesAllowed("ADMIN")
    public String getMsg(@Context SecurityContext sc) {
        return "Hello You are Admin . ";
    }
}
