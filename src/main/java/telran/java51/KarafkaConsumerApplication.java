package telran.java51;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@Bean
	Consumer<String> log() {
	    return message -> {
	    	if(!message.equals("")) {
	    		System.out.println("Received: " + message);
	    	}
	    };
	}

}

// сделать второй сервис по аналогии supplier
//https://docs.spring.io/spring-cloud-stream/docs/4.0.x/reference/html/spring-cloud-stream.html#_suppliers_sources
