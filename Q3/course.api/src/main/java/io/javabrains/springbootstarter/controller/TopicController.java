package io.javabrains.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.service.Topic;
import io.javabrains.springbootstarter.service.TopicService;

@RestController
@Component
public class TopicController {
	
	@Autowired
	TopicService topicservice;
	
	@RequestMapping("/Topics")
	public List<Topic> getAllTopics()
	{
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/Topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Topics")
	public void addTopic(@RequestBody Topic topic)
	{
	topicservice.addTopic(topic);	
	}
	@RequestMapping(method=RequestMethod.PUT, value="/Topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
	topicservice.updateTopic(id, topic);	
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/Topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
	topicservice.deleteTopic(id);	
	}
}
	
			
