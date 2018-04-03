package org.kiran.messenger;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kiran.messenger.Message;



@Path("/messages")
public class MessageResource {

	@GET
	public String display()
	{
		return"Welcome to Jax-b ";
	}
	
/*	Messageservice messageservice=new Messageservice();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return messageservice.getAllMessages();
	*/
	
}


