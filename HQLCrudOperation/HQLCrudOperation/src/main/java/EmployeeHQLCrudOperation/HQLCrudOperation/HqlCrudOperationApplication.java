package EmployeeHQLCrudOperation.HQLCrudOperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HqlCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HqlCrudOperationApplication.class, args);
	}

}
// if we are add DevTools Dependency then our server will stop automatically
// there is no need to start and stop server every time
//Communicate with database then add below Dependencies
//1)JPA Repository,2)MySQl,3)DEV Tools,4)Web App