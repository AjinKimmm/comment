package com.plc.comment.repository;

import com.plc.comment.model.ChatContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatContentRepository extends JpaRepository<ChatContent, Long> {
}
