# Order Management System

A RESTful backend application developed using Java and Spring Boot to manage customer orders with MySQL database integration.

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven
- REST APIs
- Postman

## Features Implemented

- Create a new order
- Retrieve all orders
- Retrieve an order by ID
- Update an existing order
- Delete an order
- Input validation for order details
- Centralized exception handling
- Database persistence using Spring Data JPA and Hibernate

## Application Architecture

The application follows a layered architecture:

```text
Client (Postman)
      |
      v
OrderController
      |
      v
OrderService
      |
      v
OrderRepository
      |
      v
MySQL Database
```

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/orders` | Create an order |
| GET | `/orders` | Retrieve all orders |
| GET | `/orders/{id}` | Retrieve order by ID |
| PUT | `/orders/{id}` | Update an order |
| DELETE | `/orders/{id}` | Delete an order |

## Prerequisites

- JDK 21
- MySQL 8 or compatible version
- Git

## Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE order_management;
```

Configure the database credentials using environment variables:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/order_management
spring.datasource.username=root
spring.datasource.password=${DB_PASSWORD}
```

Set the `DB_PASSWORD` environment variable to your local MySQL password.

## Run the Application

Clone the repository:

```bash
git clone https://github.com/prasadb344-java/OrderManagementSystem.git
```

Navigate to the project directory:

```bash
cd OrderManagementSystem
```

Set your database password environment variable, then run:

```bash
./mvnw spring-boot:run
```

On Windows Command Prompt, use:

```cmd
mvnw.cmd spring-boot:run
```

The application starts on:

`http://localhost:8080`

## Testing

REST API endpoints can be tested using Postman.

## Future Enhancements

- DTO implementation
- Search, filtering and pagination
- Unit and integration testing using JUnit and Mockito
- API documentation using Swagger/OpenAPI
- Docker-based deployment

## Author

Prasad B.

GitHub: https://github.com/prasadb344-java