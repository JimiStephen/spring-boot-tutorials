import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimiStephen on 2019-04-06.
 * <p>
 * EnableAutoConfiguration
 * This annotation tells Spring Boot
 * to “guess” how you want to configure Spring, based on the jar dependencies that you have added. Since
 * spring-boot-starter-webadded Tomcat and Spring MVC, the auto-configuration assumes that
 * you are developing a web application and sets up Spring accordingly.
 * <p>
 * <p>
 * The @Importannotation can be used
 * to import additional configuration classes. Alternatively, you can use  @ComponentScanto automatically
 * pick up all Spring components, including @Configurationclasses.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String home() {
        return "hello spring boot world";
    }

    public static void main(String[] args) {

        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Application.class);
    }
}
