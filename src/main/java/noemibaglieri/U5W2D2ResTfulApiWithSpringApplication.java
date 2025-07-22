package noemibaglieri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
public class U5W2D2ResTfulApiWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(U5W2D2ResTfulApiWithSpringApplication.class, args);
	}
}

