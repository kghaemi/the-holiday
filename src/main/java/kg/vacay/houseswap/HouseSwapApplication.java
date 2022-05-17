package kg.vacay.houseswap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

	@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HouseSwapApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseSwapApplication.class, args);
	}

}
