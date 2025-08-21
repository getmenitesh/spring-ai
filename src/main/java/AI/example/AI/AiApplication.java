package AI.example.AI;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages= {"com.group.ai_api", "AI.example.AI"})
@EnableAutoConfiguration(exclude={SecurityAutoConfiguration.class})
public class AiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiApplication.class, args);
	}
	
	 @Bean
	    public ChatClient.Builder chatClientBuilder(OpenAiChatModel chatModel) {
	        return ChatClient.builder(chatModel);
	    }

}
