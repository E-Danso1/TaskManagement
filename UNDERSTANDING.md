
---

##  ** UNDERSTANDING.md**

I am writing a Markdown file summarizing my understanding of **Spring**, **IoC**, and **REST**.  
Here’s a complete version for you:

```markdown
# Understanding of Spring Boot, IoC, and REST

##  What is Spring Boot?

Spring Boot is a Java-based framework that simplifies the process of building production-ready applications.  
It automatically configures the environment, dependencies, and server so developers can focus on writing business logic instead of configuration.

**Key Benefits:**
- Auto-configuration
- Embedded server (Tomcat/Jetty)
- Easy dependency management with Maven/Gradle
- Ready-to-use production setup

---

##  Inversion of Control (IoC) and Dependency Injection

**Inversion of Control (IoC)** 
-This means the control of object creation and lifecycle is handled by the Spring container, not manually by the developer.

For example, in my project:
-I used @Autowired to inject the TaskRepository into TaskController.
-This means I didn’t have to create it with new TaskRepository().
-Spring automatically provided it when needed.

Example:
```java
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}

Here, Spring automatically injects (@Autowired) an instance of TaskRepository into TaskService.

**Benefits**:
-Easier unit testing
-Reduces code duplication
-Improves flexibility and reusability


## REST Architecture and Understanding REST API
REST (Representational State Transfer) is a standard for building web APIs that use HTTP methods to perform CRUD operations.

| HTTP Method | Description         | Example URL       |
| ----------- | ------------------- | ----------------- |
| GET         | Retrieve resources  | `/api/tasks`      |
| POST        | Create new resource | `/api/tasks`      |
| PUT         | Update resource     | `/api/tasks/{id}` |
| DELETE      | Delete resource     | `/api/tasks/{id}` |

and i tested them using POSTMAN.


**Spring Boot makes building REST APIs easy with annotations like**:
-@RestController
-@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
-RequestBody
-@PathVariable

# SUMMARY # 
This project helped me understand how to:
-Structure a Spring Boot application with controller, service, and model layers.
-Use IoC for dependency management.
-Build and test REST APIs.
-Configure a database (H2 in-memory DB).
-Containerize the app using Docker.

Overall, I now feel confident about the core ideas behind Spring Boot, IoC, and REST architecture.

