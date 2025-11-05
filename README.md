"# TaskManagement"  
# Task Management REST API

### Project Overview
You’ve just joined the software development team at **CloudNova Inc.**, which is transitioning its backend systems to **Spring Boot** and **containerized microservices**.
As part of this transition, this project is a **Task Management REST API** designed to perform full **CRUD operations** (Create, Read, Update, Delete) on tasks. The API follows **clean architecture** principles using **Spring’s IoC and DI** for loose coupling and easy testing.
Eventually, this backend will integrate with a frontend dashboard for managing tasks.


##  Features
- Create, read, update, and delete tasks
- RESTful API built with Spring Boot
- In-memory H2 database integration
- Packaged and deployable via Docker
- Clean architecture using Spring’s IoC and Dependency Injection



##  Technologies Used
- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (for local development)
- **Maven**
- **Docker**
- **Postman** (for API testing)

---

##  Project Structure
Project Structure:

- TaskManagement/
    - src/
        - main/
            - java/com/Cloudnova/TaskManagement/
                - Controller/
                - Service/
                - Model/
                - Repository/
            - resources/
                - application.properties
                - data.sql (optional)
    - target/
        - TaskManagement-0.0.1-SNAPSHOT.jar
    - Dockerfile
    - pom.xml
    - README.md
    - UNDERSTANDING.md


## ▶ How to Run the Project Locally

### **1. Clone the Repository**
```bash
git clone https://github.com/<E-Danso1>/TaskManagement.git
cd TaskManagement


2. ## Build the Project ##
-Use Maven to clean and package the project:

mvn clean package

3. ## Run the Application (without Docker) ##

After building, run the JAR file:
-java -jar target/TaskManagement-0.0.1-SNAPSHOT.jar

* The application will start on
-http://localhost:8080


## API Endpoints ##

| Method | Endpoint          | Description             |
| ------ | ----------------- | ----------------------- |
| GET    | `/api/tasks/home` | Check API status        |
| POST   | `/api/tasks`      | Create a new task       |
| GET    | `/api/tasks`      | Get all tasks           |
| GET    | `/api/tasks/{id}` | Get a single task by ID |
| PUT    | `/api/tasks/{id}` | Update a task           |
| DELETE | `/api/tasks/{id}` | Delete a task           |


** Sample JSON for POST/PUT **
{
  "title": "Learn Spring Boot",
  "description": "Understand CRUD operations",
  "status": "PENDING"
}


## RUNNING THE APP WITH DOCKER ##

1. Build the Docker Image
-docker build -t taskmanagement-app:v1 .

2. Run the Container
-docker run -p 8080:8080 taskmanagement-app:v1


** Your API will now be accessible at:
http://localhost:8080/api/tasks


** Example Test with Postman **

-POST → http://localhost:8080/api/tasks
 Body (JSON):
    {
  "title": "Complete Project",
  "description": "Finalize all CRUD operations",
  "status": "IN_PROGRESS"
    }

-GET → http://localhost:8080/api/tasks to fetch all tasks


## DOCKERFILE REFERENCE ##
FROM openjdk:26-jdk
ADD target/TaskManagement-0.0.1-SNAPSHOT.jar TaskManagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/TaskManagement-0.0.1-SNAPSHOT.jar"]


## FUTURE IMPROVEMENTS ##
-Integrate MySQL/PostgreSQL database
-Add JWT-based authentication
-Create a React/Next.js frontend dashboard
-Implement CI/CD pipeline for deployment


## AUTHOR ##
Ernest Danso Opoku
Software Engineer (Backend) 

** Connect with me:
- [GitHub](https://github.com/E-Danso1)
- [https://www.linkedin.com/in/ernest-danso-opoku-40807925b/)