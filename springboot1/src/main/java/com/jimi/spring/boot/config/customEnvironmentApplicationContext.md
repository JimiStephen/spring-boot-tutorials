> A SpringApplication has ApplicationListeners and ApplicationContextInitializers
that are used to apply customizations to the context or environment. Spring Boot loads a number of
such customizations for use internally from META-INF/spring.factories. There is more than one
way to register additional customizations:
* • Programmatically, per application, by calling the addListeners and addInitializers methods
on SpringApplication before you run it.
* • Declaratively, per application, by setting the context.initializer.classes or
context.listener.classes properties.
* • Declaratively, for all applications, by adding a META-INF/spring.factories and packaging a jar
file that the applications all use as a library.