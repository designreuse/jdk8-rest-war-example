package com.lps540;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("example")
public class Service {

    @GET
    @Path("number")
    @Produces("application/json")
    public List getNumbers() {

        List<String> list = new ArrayList();

        list.add("one");
        list.add("two");

        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }
}
