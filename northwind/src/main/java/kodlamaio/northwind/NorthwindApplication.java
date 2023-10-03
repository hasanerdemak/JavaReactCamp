package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Northwind",
				version = "1.0.0",
				description = "Northwind project for Java & React Camp",
				contact = @Contact(
						name = "Hasan Erdem Ak",
						email = "hasanerdemak@gmail.com"
				)
			
		)
)
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

}
