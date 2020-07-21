package com.jimi.spring.boot.testing;

import com.jimi.spring.boot.testing.config.TestDemoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * webEnvironment attribute of
 *
 * @author jimi
 * @version 1.0
 * @SpringBootTest to further refine how your tests run:
 * • MOCK(Default) : Loads a web ApplicationContext and provides a mock web environment.
 * Embedded servers are not started when using this annotation. If a web environment is not
 * available on your classpath, this mode transparently falls back to creating a regular non-web
 * ApplicationContext. It can be used in conjunction with @AutoConfigureMockMvc or
 * @AutoConfigureWebTestClient for mock-based testing of your web application.
 * • RANDOM_PORT: Loads a WebServerApplicationContext and provides a real web environment.
 * Embedded servers are started and listen on a random port.
 * • DEFINED_PORT: Loads a WebServerApplicationContext and provides a real web environment.
 * Embedded servers are started and listen on a defined port (from your application.properties)
 * or on the default port of 8080.
 * • NONE: Loads an ApplicationContext by using SpringApplication but does not provide any web
 * environment (mock or otherwise)
 * <p>
 * Detecting Web Application Type
 * @SpringBootTest(properties = "spring.main.web-application-type=reactive")
 * @date 2020/7/21 14:40
 */


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = "spring.main.web-application-type=reactive"
//args = "--app.test=one" // this version no support
)
@Import(TestDemoConfiguration.class)
public class TestSpringApplicaionDemo {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringApplicaionDemo.class);
    }
}
