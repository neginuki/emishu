package world.sake;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloQuarkus {

    @GET
    public String hello() {
        System.out.println("aaaaa");

        return """
                {
                  "message": "hello"
                }
                    """;
    }
}
