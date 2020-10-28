package deors.demos.microservices.bookrecservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@SpringBootApplication
public class BookrecserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrecserviceApplication.class, args);
	}

}
