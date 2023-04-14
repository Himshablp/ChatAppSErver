package com.chat.app;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.model.ChatLog;
import com.chat.app.model.Message;
import com.chat.app.repo.ChatLogRepository;
import com.chat.app.repo.MessageRepository;
import com.chat.app.repo.UserRepository;

@RestController
public class MessageController {
	
	

	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ChatLogRepository chatLogRepository;
	private List<Message> list = new ArrayList<>();
	private static String name;
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getContent(@RequestBody Message message) {    
		message.setLocalTime(LocalTime.now());
		messageRepository.save(message);
		list.add(message);
		name = message.getName();

		try {
			// processing
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return message;
	}
	
	@PostMapping("/chatlog")
	public void addchatLog() {

		ChatLog chatlog = new ChatLog();
		chatlog.setMessage(list);
		chatLogRepository.save(chatlog);
	}
	@GetMapping("/chatlogs")
	public List<Message> getMessage(){
		return chatLogRepository.findById(102).get().getMessage();
		
	}

}
