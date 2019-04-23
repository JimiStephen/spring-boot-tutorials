#spring boot mvc

##   1  spring.factories 添加错误分析
FailureAnalyzeris a great way to intercept an exception on startup and turn it into a human-readable
message, wrapped in a FailureAnalysis. Spring Boot provides such an analyzer for applicationcontext-related exceptions, JSR-303 validations, and more. You can also create your own.

##  banner 添加相关的文件
启动的时候会显示相应的文本图片

## appListener Event
Application events are sent in the following order, as your application runs:
1. An ApplicationStartingEventis sent at the start of a run but before any processing, except
for the registration of listeners and initializers.
2. An ApplicationEnvironmentPreparedEventis sent when the  Environmentto be used in the
context is known but before the context is created.
3. An ApplicationPreparedEventis sent just before the refresh is started but after bean definitions
have been loaded.
4. An  ApplicationStartedEvent is  sent  after  the  context  has  been  refreshed  but  before  any
application and command-line runners have been called.
5. An ApplicationReadyEventis sent after any application and command-line runners have been
called. It indicates that the application is ready to service requests.
6. An ApplicationFailedEventis sent if there is an exception on startup.
