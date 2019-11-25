### 步骤
- 建立SpringBoot工程

- 添加JAR包依赖
```xml
      <dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>nacos-config-spring-boot-starter</artifactId>
            <version>0.2.3</version>
        </dependency>
```

- 在application.properties里添加NACOS地址
```properties
nacos.config.server-addr=127.0.0.1:8848
```

- 在SpringBoot Main函数方法上添加配置读取注解
```java
@NacosPropertySource(dataId = "example", autoRefreshed = true)
```

- 在需要读取配置文件的地方启用`@NacosValue`注解，比如
```java
    @NacosValue(value = "${example1:not ready}", autoRefreshed = true)
    private String example1Value;
```






### 引用
- https://nacos.io/zh-cn/docs/quick-start-spring-boot.html