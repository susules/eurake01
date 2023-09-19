package tr.com.tsat.staj23eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Staj23EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Staj23EurekaApplication.class, args);
    }

}
