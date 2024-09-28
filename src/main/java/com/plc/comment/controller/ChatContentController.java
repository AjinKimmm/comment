package com.plc.comment.controller;

import com.plc.comment.model.ChatContent;
import com.plc.comment.service.ChatContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chatcontents")
public class ChatContentController {

    @Autowired
    private ChatContentService chatContentService;

    @PostMapping
    public ChatContent createChatContent(@RequestBody ChatContent chatContent) {
        return chatContentService.createChatContent(chatContent);
    }

    @GetMapping("/room/{roomId}")
    public List<ChatContent> getChatContentsByRoomId(@PathVariable Long roomId) {
        return chatContentService.getChatContentsByRoomId(roomId);
    }
}
