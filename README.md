### Setup of H2 in a Spring Boot Application

In Spring Boot, adding H2 is as simple as including the H2 dependency in your `pom.xml` file:

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

Next, configure H2 in your `application.properties` file:

```properties
# Enable the H2 console
spring.h2.console.enabled=true

# URL for H2 database in memory mode
spring.datasource.url=jdbc:h2:mem:testdb

# Username and password
spring.datasource.username=sa
spring.datasource.password=password

# Dialect for H2
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

Access the H2 console by going to `http://localhost:8080/h2-console` after starting your application. You can use the credentials from the `application.properties` to log in.

### Setup of Swagger in a Spring Boot Application
### 1. **Add Swagger Dependencies**
In your `pom.xml` file, add the following dependencies to enable Swagger:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.6.0</version> <!-- Check for the latest version -->
</dependency>
```

### 2. **Accessing Swagger UI**
Swagger UI will be available at:
- `http://localhost:8080/swagger-ui.html`

2. Open your browser and go to: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).
