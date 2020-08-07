package com.jimi.spring.framework.web.mvc.initer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class DemoSameWebxmlWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) {
        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new
                DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/example/*");
    }
//
//<web-app>
//<servlet>
//<servlet-name>example</servlet-name>
//<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//<load-on-startup>1</load-on-startup>
//</servlet>
//<servlet-mapping>
//<servlet-name>example</servlet-name>
//<url-pattern>/example/*</url-pattern>
//</servlet-mapping>
//</web-app>


}