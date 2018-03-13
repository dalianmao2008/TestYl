package com.service.ylt2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-13T08:06:36.639Z")

@RestSchema(schemaId = "ylt2")
@RequestMapping(path = "/yl-t2", produces = MediaType.APPLICATION_JSON)
public class Ylt2Impl {

    @Autowired
    private Ylt2Delegate userYlt2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userYlt2Delegate.helloworld(name);
    }

}
