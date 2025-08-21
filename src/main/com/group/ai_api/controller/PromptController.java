package com.group.ai_api.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("ai")
public class PromptController {
	
	@Autowired
	private final ChatClient.Builder  chatClient;

    public PromptController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder;
    }

	// constructor
	@GetMapping("/askAi")
    public String askAi(@RequestParam String prompt) {
        return chatClient.build().prompt()
        		.user(prompt)
        		.call()
        		.content();
		
    }
}
