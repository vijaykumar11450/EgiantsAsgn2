package org.kiran.messenger;

import java.util.ArrayList;
import java.util.List;



public class Messageservice {

	
	public List<Message> getAllMessages()
	{
		Message m1=new Message(1, "Hello World","Kiran");
		Message m2=new Message(2, "Hello jersey","Kumar");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
}
