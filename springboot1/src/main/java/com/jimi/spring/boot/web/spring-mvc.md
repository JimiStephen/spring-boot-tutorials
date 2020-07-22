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