package co.edu.ufps.tic_tac_toe;

import co.edu.ufps.tic_tac_toe.controllers.ServidorSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
                new ServidorSocket().escuchar();
	}

}
