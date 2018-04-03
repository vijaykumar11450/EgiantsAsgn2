package io.javabrains.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TopicService {
	
		private List<Topic>topics= new ArrayList<>(Arrays.asList(
				new Topic("Spring","Spring MVC","Spring MVC Description"),
				new Topic("Hibernate","Hibernate ORM","Hibernate ORM Description"),
				new Topic("Java"," Java-8","Java-8 Descriptio")
				));


	public List<Topic> getAllTopics() {
		 
		return topics;
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	

	public Topic getTopic(String id) {
	 
		 for(int i=0; i<topics.size(); i++)
		 {
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
			 
	return t;
			}
		 }
		return getTopic(id);
	}

	public void updateTopic(String id, Topic topic) {
	 for(int i=0; i<topics.size();i++)
	 {
		 Topic t=topics.get(i);
		 if(t.getId().equals(id))
		 {
			 topics.set(i, topic);
			 return;	
		 }
	 }
		
	}
/*public void deleteTopic(Topic topic) {
		{
			for (int i=0; i<topics.size();i++)
			{
				Topic t=topics.get(i);
				if(t.getId().equals(i))
				{
				return;	
				}
			}
		}
		
	}*/


	public void deleteTopic(String id) {
	 topics.removeIf(t->t.getId().equals(id));
		
	}
	
	

}
