package org.jboss.pressgang.ccms.rest.jaxrsinterfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.pressgang.ccms.rest.collections.RESTVersionDetailsCollection;

@Path("/")
public interface RESTInterface
{
    /**
     * Returns details about the Versions available on the server.
     */
    @GET
    @Consumes({ "*" })
    @Produces(MediaType.APPLICATION_JSON)
    public RESTVersionDetailsCollection setVersionDetails();
}
