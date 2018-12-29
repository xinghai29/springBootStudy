# 引入log4j依赖
  在创建Spring Boot工程时，我们引入了spring-boot-starter，其中包含了spring-boot-starter-logging，该依赖内容就是Spring Boot默认的日志框架Logback，所以我们在引入log4j之前，需要先排除该包的依赖，再引入log4j的依赖，就像下面这样：
  
# Log4j提供的appender有以下几种
org.apache.log4j.ConsoleAppender（控制台），  
org.apache.log4j.FileAppender（文件），  
org.apache.log4j.DailyRollingFileAppender（每天产生一个日志文件），  
org.apache.log4j.RollingFileAppender（文件大小到达指定尺寸的时候产生一个新的文件），  
org.apache.log4j.WriterAppender（将日志信息以流格式发送到任意指定的地方）

# Log4j提供的layout有以下几种：
  org.apache.log4j.HTMLLayout（以HTML表格形式布局），  
  org.apache.log4j.PatternLayout（可以灵活地指定布局模式），  
  org.apache.log4j.SimpleLayout（包含日志信息的级别和信息字符串），  
  org.apache.log4j.TTCCLayout（包含日志产生的时间、线程、类别等等信息）



# 参考文献
[最详细的Log4J使用教程](https://blog.csdn.net/u013870094/article/details/79518028)