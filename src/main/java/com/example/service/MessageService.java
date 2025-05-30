package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Message;
import com.example.repository.MessageRepository;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    public Optional<Message> getMessage(int messageId) {
        return messageRepository.findById(messageId);
    }

    public void deleteMessage(int messageId) {
        messageRepository.deleteById(messageId);
    }

    public void updateMessage(Message message) {
        messageRepository.save(message);
    }

    public List<Message> getMessageByAccount(Integer postedBy) {
        return messageRepository.findByPostedBy(postedBy);
    }


}
