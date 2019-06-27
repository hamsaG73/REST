package com.lti.rest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class Hello {

@GET
@Path("/plaintext")
@Produces(MediaType.TEXT_PLAIN)
public String sayPlainTextHello()
{
return"Hello jersey Plain";
}
@GET
@Path("/xmlhello")
@Produces(MediaType.TEXT_XML)
public String sayXMlHello()
{
return"<?xml version=\"1.0\"?>"+"<hello>Hello Jersey"+"</hello>";
}

@GET
@Produces(MediaType.TEXT_HTML)
public String sayHTMLHello()
{
return"<HTML>"+"<TITLE>"+"HEllo Jersey"+"</TITLE>"+"<BODY><H1>"+"HELLO JERSEY HTML"
+ "</H1></BODY>"+"</HTML>";
}
}
