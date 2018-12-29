* 热部署maven依赖

```$xslt
  <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <optional>true</optional>
  </dependency>
```
代码修改完，点击build编译一下即可，再次刷新页面或者请求接口会发现修改已生效。