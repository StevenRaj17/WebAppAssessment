
# Web Application Assessment

Based on the core requirements of the given assessment, this project was developed using the Java programming language, Spring Boot application framework for the back-end development, and Thymeleaf templates for the front-end development. Several dependencies were implemented in this project to meet the functionality of the Web Application, especially the Spring Security dependency for the Authentication and Authorization of the users accesssing the Web Application. Additionally, the MySQL database was implemented in this project in order to store the information of the users accesssing the Web Application. A detailed guideline of this project is provided below to install and accesss the project locally.






## 1.0) Project Requirements

**Framework :** Spring Tool Suite 4 for Eclipse

**Spring Boot Version :** 3.3.0

**Project Type :** Maven

**Language :** Java

**JDK Verison :** Java 17

**Dependencies :** Spring Web, Thymeleaf, Spring Data JPA, MySQL, Spring Security

**Database :** MySQL Workbench

## 2.0) Steps To Run The Project Locally

Download the project as ZIP folder and extract the file.

Git link :

```bash
https://github.com/StevenRaj17/WebAppAssessment.git
```

## 2.1) Project Setup


  - Open Spring Tool Suite 4. (Preferred)

  - Click on "File" > "Import" > "Maven" > "Existing Maven Projects".

  - Click on "Browse" and choose the extracted folder from "Downloads".

  - After selecting the folder, click "Finish" to import the project.

  - You may see the project in the "Package Explorer" once the project is succcessfully imported in Spring Tool Suite.

## 2.2) Database Setup


  - Open MySQL Workbench. (Preferred)

  - Click the "Create New SQL" tab.
  
  - Create a database using this SQL command : 
  ```bash
    create database <database_name>;
  ```

  - Refresh the "SCHEMAS" to check if the database is created.

## 2.3) Application Properties Setup

  - Open the "application.properties" file under "src/main/resources".

  - Modify the following properties according your MySQL Workbench database name, username and password :
  ```bash
  spring.application.name=MyRoleAuthentication
  spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.username=<your_username>
  spring.datasource.password=<your_password>
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  spring.thymeleaf.cache=false
  spring.main.allow-circular-references=true
  server.port=8080
```
  - Save the "application.properties"

## 2.4) Running The Application


  - Choose the class "MyRoleAuthenticationApp" that is located under "src/main/java/com.role.auth".

  - Right click the "MyRoleAuthenticationApp" class and "Run As" > "Spring Boot App".

  - You may see an output similar to the following in your Console :

```bash
  <Start of the Console>

.   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
.
.
.
.
Hibernate: select count(*) from role r1_0
Hibernate: select r1_0.id,r1_0.role from role r1_0 where r1_0.id=?
Hibernate: insert into role (role) values (?)
Hibernate: select r1_0.id,r1_0.role from role r1_0 where r1_0.id=?
Hibernate: insert into role (role) values (?)

  <End of console>
```
- The Web Application is now ready to be accesssed.

## 3.0) Usage

- Access the web application : Open a web browser and go to http://localhost:8080.

- Register yourself : Create a new account as you are accessing the app for the first time.

- Log in : Log in with your credentials.

- Access restricted pages : Visit pages restricted based on your selected role (User and Admin).


## 4.0) Possible Erros You May Encounter 
***************************
APPLICATION FAILED TO START
***************************

Description:

Web server failed to start. Port 8080 was already in use.

Action:

Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.

- If you encounter this error at your console after running the application, kindly change the server port number in the application.properties to resolve the issue.

- Make sure you use any port numbers from 1000 to 9999 to avoid conflicts and security issues.





    
    


## 5) Alternative IDE To Run The Project

Project Setup in IntelliJ IDEA :


  - Open IntelliJ IDEA IDE.

  - Click on "File" > "Open".

  - Locate the downloaded file and click "OK".

  - Click open as "Maven Project" > "OK" >"Trust Project" > "New Window".

  - The project is succcessfully imported in IntelliJ IDEA. 
  
The (2.2) Database Setup and (2.3) Application Properties Set-Up remains the same as mentioned above. Finally, right click the "MyRoleAuthenticationApp" and run the application to complete the project setup. Accessing the Web Application remains the same as mentioned in (3.0) Usage.







## 6.0) Application Features

- Login Page
- Registration Page
- User Portal
- Admin Portal
- Welcome Messages
- Error Messages

With this, I conclude my README file. I hope the guideline I have provided above will help the users to download and run the application locally.Thank you.

