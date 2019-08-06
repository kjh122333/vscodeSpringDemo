# vscodeSpringDemo

## Spring boot

> 1. Check `Java version`

```command
>javac -version

javac 12.0.2
```

> 2. Install ***extension***   
[spring boot extension pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)

> 3. 프로젝트 생성 1 - [start.spring.io](https://start.spring.io/)

> |분류|설정|
> |:---:|:---:|
> |***Project***|`Maven Project`|
> |***Language***|`Java`|
> |***Spring Boot***|`2.1.6`|
> |***Project Metadata***|▼ ▼ ▼|
> |**Group**|com.example|
> |**Artifact**|demo|
> |**Options**|▼ ▼ ▼|
> |*Name*|demo|
> |*Description*|Demo project for Spring Boot|
> |*Package Name*|com.example.demo|
> |*Packaging*|`War`|
> |*Java*|`12`|
> |***Dependencies*** <br> (2 selected)|▼ ▼ ▼|
> |**Developer Tools**| `Spring Boot DevTools` : Provides fast application restarts, LiveReload, and configurations for enhanced development experience.|
> |**Web**|`Spring Web Starter` : Build web, including RESTful, applications using Spring MVC. Uses `Apache` Tomcat as the default|
>> finish : `demo.zip`

> 4. `demo.zip` 압축풀기 후 스프링 프로젝트에 `demo` 폴더 삽입

> 5. 프로젝트에 파일 추가 

demo/src/main/java/com/example/demo/`HelloController.java`
```java
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        System.out.println("!@#!#!@#!@!#!@#!@#!@#");
        ModelAndView view =new ModelAndView();
        view.setViewName("hello");
        view.addObject("name", "Hello");     
        return  view;
    }
}
```

***demo/src/main/resources/META-INF/resources/WEB-INF/jsp/`hello.jsp`***
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <!-- http://localhost:8080/ -->
    Test Spring boot in Vscode<h2>${name}</h2>
</body>
</html>
```

`application.properties` 에 추가
```properties
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
```

`pom.xml` 에 추가
```xml
<dependency>
	<groupId>org.apache.tomcat.embed</groupId>
	<artifactId>tomcat-embed-jasper</artifactId>
	<scope>provided</scope>
</dependency>
```    
```xml
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<scope>provided</scope>
</dependency>
```


---
