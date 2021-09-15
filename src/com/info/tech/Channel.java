package com.info.tech;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Subscribers> subList = new ArrayList<>();
	
	@Override
	public void subscribeChannel(Subscribers subscribers) {
		subList.add(subscribers);
	}
	
	@Override
	public void UnsubscribeChannel(Observer subscribers) {
		subList.remove(subscribers);
	}
    
	@Override
	public void sendNotification(String program) {
		for (Subscribers obj : subList) {
			obj.update(obj,program);
		}
	}
}
