package com.plc.comment.controller;

import com.plc.comment.model.ChatRoom;
import com.plc.comment.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chatrooms")
public class ChatRoomController {

	@Autowired
	private ChatRoomService chatRoomService;

	@PostMapping
	public ChatRoom createChatRoom(@RequestBody ChatRoom chatRoom) {
		return chatRoomService.createChatRoom(chatRoom);
	}

	@GetMapping("/{roomId}")
	public Optional<ChatRoom> getChatRoomById(@PathVariable Long roomId) {
		return chatRoomService.getChatRoomById(roomId);
	}

	@GetMapping
	public List<ChatRoom> getAllChatRooms() {
		return chatRoomService.getAllChatRooms();
	}
}
