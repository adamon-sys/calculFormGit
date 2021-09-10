/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculform;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author adams
 */
@Path("a15")
public class CalculForm {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculForm
     */
    public CalculForm() {
    }

    /**
     * Retrieves representation of an instance of calculform.CalculForm
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("affichersharpeslist")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String sharpesList() {
        //TODO return proper representation object
        return "[{\n"
                + "		\"name\": \"Circle\",\n"
                + "		\"NumberofParam\": 1\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Rectangle\",\n"
                + "		\"NumberofParam\": 2\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Trapezoid\",\n"
                + "		\"NumberofParam\": 3\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Elipse\",\n"
                + "		\"NumberofParam\": 2\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Triangle\",\n"
                + "		\"NumberofParam\": 2\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Square\",\n"
                + "		\"NumberofParam\": 1\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Parallelogram\",\n"
                + "		\"NumberofParam\": 2\n"
                + "	},\n"
                + "	{\n"
                + "		\"name\": \"Sector\",\n"
                + "		\"NumberofParam\": 2\n"
                + "	}\n"
                + "]";
    }

}
