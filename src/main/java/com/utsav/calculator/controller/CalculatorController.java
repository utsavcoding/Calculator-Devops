package com.utsav.calculator.controller;

import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Path("/calculator")
public class CalculatorController {
	
	@POST
    @Path("/evaluate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String calculate(String s) throws Exception {
		Gson gson=new Gson();
		Map<String, Object> map = gson.fromJson(s, Map.class); // parse
	    JsonObject jsonTree = (JsonObject) gson.toJsonTree(map);
	    String data = jsonTree.get("data").toString();
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String result=(String) engine.eval(data);
    	return result;
    }

}

//JSONObject jObj =(JSONObject)new JSONParser().parse(s);
//CalculatorResponse c=new CalculatorResponse(jObj.get("data").toString());
//String m=c.evaluate();