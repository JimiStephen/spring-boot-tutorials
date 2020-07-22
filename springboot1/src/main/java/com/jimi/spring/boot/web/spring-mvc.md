> Spring Boot serves static content from a directory called _/static (or /public or /
resources or /META-INF/resources)_ in the classpath or from the root of the **ServletContext**.
It uses the ResourceHttpRequestHandler from Spring MVC so that you can modify that behavior
 by adding your own **WebMvcConfigurer** and overriding the **addResourceHandlers** method.
>
>By default, resources are mapped on /**, but you can tune that with the spring.mvc.staticpath-pattern property. For instance, relocating all resources to /resources/** can be achieved
 as follows:
>
> `spring.mvc.static-path-pattern=/resources/**`
>
>`spring.resources.chain.strategy.content.enabled=true
  spring.resources.chain.strategy.content.paths=/**`
>
>`spring.resources.chain.strategy.content.enabled=true
  spring.resources.chain.strategy.content.paths=/**
  spring.resources.chain.strategy.fixed.enabled=true
  spring.resources.chain.strategy.fixed.paths=/js/lib/
  spring.resources.chain.strategy.fixed.version=v12`

> 
>**org.springframework.boot.autoconfigure.web.ResourceProperties**
>
>
>**ConfigurableWebBindingInitializer**
>Spring MVC uses a WebBindingInitializer to initialize a WebDataBinder for a particular request.
 If you create your own ConfigurableWebBindingInitializer @Bean, Spring Boot automatically
 configures Spring MVC to use it.
>
>**Template Engines**
>When you use one of these templating engines with the default configuration, your templates are picked
 up automatically from src/main/resources/templates.
>
>**Error Handling**
>By default, Spring Boot provides an /error mapping that handles all errors in a sensible way, and
 it is registered as a “global” error page in the servlet container. For machine clients, it produces a
 JSON response with details of the error, the HTTP status, and the exception message. For browser
 clients, there is a “whitelabel” error view that renders the same data in HTML format (to customize it,
 add a View that resolves to error). To replace the default behavior completely, you can implement
 ErrorController and register a bean definition of that type or add a bean of type ErrorAttributes
 to use the existing mechanism but replace the contents.
>
>**@ControllerAdvice** 
>You can also define a class annotated with @ControllerAdvice to customize the JSON document
 to return for a particular controller and/or exception type,
>
>**Mapping Error Pages outside of Spring MVC**
>
>`@Bean
 public ErrorPageRegistrar errorPageRegistrar(){
 return new MyErrorPageRegistrar();
 }
 // ...
 private static class MyErrorPageRegistrar implements ErrorPageRegistrar {
 @Override
 public void registerErrorPages(ErrorPageRegistry registry) {
 registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400"));
 }
 }`
>
>Registering Servlets, Filters, and Listeners as Spring Beans
>If convention-based mapping is not flexible enough, you can use the ServletRegistrationBean,
 FilterRegistrationBean, and ServletListenerRegistrationBean classes for complete
 control.
>
>
>**Servlet Context Initialization**
 Embedded servlet containers do not directly execute the Servlet
 3.0+ javax.servlet.ServletContainerInitializer interface or Spring’s
 org.springframework.web.WebApplicationInitializer interface.
>
>If you need to perform servlet context initialization in a Spring
 Boot application, you should register a bean that implements the
 org.springframework.boot.web.servlet.ServletContextInitializer interface. The
 single onStartup method provides access to the ServletContext and, if necessary, can easily be
 used as an adapter to an existing WebApplicationInitializer.
>
>**Scanning for Servlets, Filters, and listeners**
 When using an embedded container, automatic registration of classes annotated with @WebServlet,
 @WebFilter, and @WebListener can be enabled by using @ServletComponentScan.
>@ServletComponentScan has no effect in a standalone container, where the container’s builtin discovery mechanisms are used instead.
>
>The ServletWebServerApplicationContext
 Under the hood, Spring Boot uses a different type of ApplicationContext for
 embedded servlet container support. The ServletWebServerApplicationContext is a
 special type of WebApplicationContext that bootstraps itself by searching for a
 single ServletWebServerFactory bean. Usually a TomcatServletWebServerFactory,
 JettyServletWebServerFactory, or UndertowServletWebServerFactory has been autoconfigured.
>
>**Customizing Embedded Servlet Containers**
> application.properties file. Common server settings include:
> * • Network settings: Listen port for incoming HTTP requests (server.port), interface address to bind
 to server.address, and so on.
> * • Session settings: Whether the session is persistent (server.servlet.session.persistence),
 session timeout (server.servlet.session.timeout), location of session
 data (server.servlet.session.store-dir), and session-cookie configuration
 (server.servlet.session.cookie.*).
> * • Error management: Location of the error page (server.error.path) and so on.
> * • SSL
` server.port=8443
 server.ssl.key-store=classpath:keystore.jks
 server.ssl.key-store-password=secret
 server.ssl.key-password=another-secret`
> * • HTTP compression
>`server.compression.enabled=true`
>
**Programmatic Customization**
If you need to programmatically configure your embedded servlet
container, you can register a Spring bean that implements the
WebServerFactoryCustomizer interface. WebServerFactoryCustomizer provides access to
the ConfigurableServletWebServerFactory, which includes numerous customization setter
methods.
> com.jimi.spring.boot.web.config.WebserverCustomizationBean
>
>**Customizing ConfigurableServletWebServerFactory Directly**
> WebConfig @bean ConfigurableServletWebServerFactory
>
>