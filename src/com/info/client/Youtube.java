package com.info.client;

import com.info.tech.Channel;
import com.info.tech.Subscribers;

public class Youtube {
	
	
	public static void main(String[] args) {
		
		Channel channel = new Channel();
		
		Subscribers s1 = new Subscribers("Rahul");
		Subscribers s2 = new Subscribers("Raj");
		Subscribers s3 = new Subscribers("Rashmika");
		Subscribers s4 = new Subscribers("kaul");
		Subscribers s5 = new Subscribers("Abishek ");
		
		channel.subscribeChannel(s1);
		channel.subscribeChannel(s2);
		channel.subscribeChannel(s3);
		channel.subscribeChannel(s4);
		channel.subscribeChannel(s5);

	   channel.sendNotification("Learn Data Science with python ");
	   
	   channel.UnsubscribeChannel(s5);
	}

}
