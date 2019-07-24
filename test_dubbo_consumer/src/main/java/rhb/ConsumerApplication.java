package rhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConsumerApplication {
	public static void main(String[] args) {
//		new SpringApplicationBuilder(ConsumerApplication.class)
//			.web(WebApplicationType.NONE)
//			.run(args);
		
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
