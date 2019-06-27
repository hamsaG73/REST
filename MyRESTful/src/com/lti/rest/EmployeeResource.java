package com.lti.rest;

import javax.ws.rs.*;

@Path("employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
    public String getJson(@PathParam("empno")int empno)
    {
	
		switch(empno)
		{
		case 1: return "{'name':'Himanshu','age':22}";
		
		case 2: return "{'name':'Meghana','age':23}";
		
		case 3: return "{'name':'Greeshma','age':22}";
		
		default:return "{'name':'HJ','age':21}";
		
	    }
    }
	
	
}
