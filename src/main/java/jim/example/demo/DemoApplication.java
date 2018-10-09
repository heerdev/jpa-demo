package jim.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
/*@EntityScan(
		basePackageClasses = { DemoApplication.class, Jsr310JpaConverters.class },
		basePackages={"jim.example.demo"}
)*/
@ComponentScan(basePackages={"jim.example.demo"})
/*@EnableJpaRepositories(basePackages="jim.example.demo.respositories")
@EnableTransactionManagement*/
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
