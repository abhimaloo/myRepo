package com.geeps.backend.Services.rest;

import com.geeps.backend.hello.domain.Sample;
import com.geeps.backend.hello.domain.SampleBuilder;

import com.geeps.backend.hello.serviceapi.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;


@Component
@Path("/v1/helloworld")
public class HelloResource {

    @Autowired
    private SampleService sampleService;


    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Hello get(){
        Hello he = new Hello();
        he.name = "Hello Maloo";
        Sample sample = SampleBuilder.sample().message("Hello Maloo").entity(UUID.randomUUID().toString().toUpperCase()).build();
        sample  = sampleService.create(sample);
        return he;
    }

}
