### 1. **Set up MySQL Database**
   - Install MySQL on your system and create a database. You can use the following SQL command to create a database:

     ```sql
     CREATE DATABASE my_database;
     ```

### 2. **Add MySQL Dependency in `pom.xml`**
   If you are using Maven, add the MySQL dependency to your `pom.xml`:

   ```xml
   <dependency>
       <groupId>mysql</groupId>
       <artifactId>mysql-connector-java</artifactId>
       <version>8.0.33</version> <!-- Use the latest stable version -->
   </dependency>
   ```

### 3. **Configure Database in `application.properties`**
   Specify the connection details of your MySQL database in the `src/main/resources/application.properties` file:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/my_database
   spring.datasource.username=root
   spring.datasource.password=my_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

   - Replace `my_database` with the name of your MySQL database.
   - Replace `root` and `my_password` with your MySQL username and password.



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
