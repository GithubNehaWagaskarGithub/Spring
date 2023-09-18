package SpringMVCDesignPatternApplication1.SpringMVCDesignPatternApplication1;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@SpringBootApplication
public class SpringMvcDesignPatternApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDesignPatternApplication1Application.class, args);
	}
}
