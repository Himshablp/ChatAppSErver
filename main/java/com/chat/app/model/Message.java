package com.chat.app.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue
	private int messageId;
	private String name;
	private String content;
	private LocalTime localTime;
	
	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	
	public int getMessageId() {
		return messageId;
	}


	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}


	public LocalTime getLocalTime() {
		return localTime;
	}


	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
