package com.chat.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.app.model.ChatLog;

public interface ChatLogRepository extends JpaRepository<ChatLog, Integer>{

}
