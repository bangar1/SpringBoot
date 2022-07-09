package starter;

import controller.AppController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import topics.TopicController;

@SpringBootApplication
@ComponentScan(basePackageClasses= AppController.class)
@ComponentScan(basePackageClasses= TopicController.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
