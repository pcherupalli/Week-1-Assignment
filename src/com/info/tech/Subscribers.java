package com.info.tech;

public class Subscribers implements Observer {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subscribers(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Subscribers sub,String notify) {
		System.out.println(notify +" for the user "+sub.getName());
	}

}
