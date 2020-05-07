package com.utsav.calculator.controller;

import java.text.DecimalFormat;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorController {
	
	@POST
    @Path("/evaluate")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String calculate(String data) throws Exception {
		data=data.substring(1,data.length()-1);
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String result=String.valueOf(engine.eval(data));
	    if(result.contains(".")) {
	    	DecimalFormat df = new DecimalFormat("#.#####");
	    	result=df.format(Double.parseDouble(result));
	    }
    	return result;
    }

}