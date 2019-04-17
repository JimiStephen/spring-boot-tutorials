#spring boot config profilen
```java
@Configuration
@Profile("production")
public classProductionConfiguration {
    //
}

``` 

## config application.properties application.yml



## loggger
``The default log configuration echoes messages to the console as they are written. By default, ERRORlevel,  WARN-level, and  INFO-level messages are logged. You can also enable a “debug” mode by starting
  your application with a --debugflag.``
  
< java -jar myapp.jar --debug >

```You can also specify debug=truein your application.properties. ```