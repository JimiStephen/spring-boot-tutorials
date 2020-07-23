>Traditionally, JPA “Entity” classes are specified in a persistence.xml file. With Spring Boot,
this file is not necessary and “Entity Scanning” is used instead. By default, all packages
below your main configuration class (the one annotated with @EnableAutoConfiguration or
@SpringBootApplication) are searched.

>Any classes annotated with @Entity, @Embeddable, or @MappedSuperclass are considered. 