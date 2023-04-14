package com.chat.app.model;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class ChatLog {
	@Id
	@GeneratedValue
	private int chatLogId;
	@OneToMany
	private List<Message> message;
	@OneToOne
	private User user;
	public int getChatLogId() {
		return chatLogId;
	}
	public void setChatLogId(int chatLogId) {
		this.chatLogId = chatLogId;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
