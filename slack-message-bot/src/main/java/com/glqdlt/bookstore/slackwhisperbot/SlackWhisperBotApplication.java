package com.glqdlt.bookstore.slackwhisperbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackWhisperBotApplication {
//	https://api.slack.com/methods/chat.postMessage
	public static void main(String[] args) {
		SpringApplication.run(SlackWhisperBotApplication.class, args);
	}

}

