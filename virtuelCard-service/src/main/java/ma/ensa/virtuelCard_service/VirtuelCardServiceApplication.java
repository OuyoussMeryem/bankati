package ma.ensa.virtuelCard_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VirtuelCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtuelCardServiceApplication.class, args);
	}

}
