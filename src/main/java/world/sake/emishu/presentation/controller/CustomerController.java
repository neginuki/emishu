package world.sake.emishu.presentation.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.seasar.doma.jdbc.criteria.Entityql;

import world.sake.emishu.infrastructure.datasource.entity.Customer;
import world.sake.emishu.infrastructure.datasource.entity.Customer_;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerController {

    @Inject
    Entityql entityql;

    @GET
    public List<Customer> listNames() {
        var from = new Customer_();

        return entityql.from(from).orderBy(customer -> customer.asc(from.customerId)).fetch();
    }
}
