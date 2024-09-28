package com.plc.comment.service;

import com.plc.comment.model.ChatContent;
import com.plc.comment.repository.ChatContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatContentService {

    @Autowired
    private ChatContentRepository chatContentRepository;

    public ChatContent createChatContent(ChatContent chatContent) {
        return chatContentRepository.save(chatContent);
    }

    public List<ChatContent> getChatContentsByRoomId(Long roomId) {
        return chatContentRepository.findAll(); // 조건 추가 가능
    }
}
