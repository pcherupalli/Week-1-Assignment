package com.info.tech;

public interface Subject {

	void subscribeChannel(Subscribers subscribers);

	void UnsubscribeChannel(Observer subscribers);

	void sendNotification(String program);

}