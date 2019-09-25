###本项目简要说明
* 1，项目主要是对spring boot进行学习。

* 2，当前的项目主要的学习内容是：
  - 1，spring boot 启动方式，
  - 2，spring boot xml配置是如何使用的。
  - 3，spring boot listen实现。
  - 4，spring boot 的log配置


####配置文件application.properties
+ 1,首先它会从根目录去读取，也就是我的工程中的 src/main/resources/ 目录。

+ 2，其次它会从根目录下面的config 文件读取。

+ 3，根目录配置文件和config配置文件两个同时都有配置对应的属性时，config目录下面的配置文件会对根目录配置文件的内容进行覆盖。