# 📚 Library Management REST API

This is a simple **Library Management** system built using **Spring Boot** and **MySQL**. It provides RESTful endpoints to manage books in a library, allowing operations like adding, retrieving, deleting, and updating book availability.

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- MySQL
- Maven
- Lombok
- REST API

---

## 📂 Project Structure

<img width="450" height="824" alt="image" src="https://github.com/user-attachments/assets/14575fa7-a601-41d8-abef-65f4d0c8a1a8" />


---

## ⚙️ Configuration

Set your DB credentials in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

---

# 📘 Library Management API – Endpoints Documentation

This document outlines all the REST API endpoints available in the Library Management system built with Spring Boot.

## Base URL

http://localhost:8080/books


## 🔁 API Endpoints

### ➕ Add a Book


POST  /books
```bash
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}
```
### 📚 Get All Books

GET  /books

### 🔍 Get Book by ID

GET  /books/{id}

### ❌ Delete Book

DELETE  /books/{id}

✏️ Update Availability

PATCH  /books/{id}/availability?available=false


---

## 🖥️ Screenshots

### ✅ MySQL Table

Below is a screenshot of the `books` table in the MySQL `library` database:

<img width="1155" height="225" alt="image" src="https://github.com/user-attachments/assets/ea6ed467-9d1b-48d5-bd36-f04effd2d1d3" />


---

### 📮 Postman API Testing

Here are screenshots of Postman requests to test the API:

- **Add Book**
  
  <img width="1753" height="859" alt="image" src="https://github.com/user-attachments/assets/58dcb336-f03b-4806-93e8-893f296cc948" />

- **Get By id**
  
 <img width="1775" height="754" alt="image" src="https://github.com/user-attachments/assets/e50e1c73-4966-424a-af43-9b0588c25c50" />

- **Get All Books**
  
 <img width="1752" height="899" alt="image" src="https://github.com/user-attachments/assets/d98b2460-7a60-4b58-8ccb-c6c7c10bb3bc" />


- **Delete Book**
  
<img width="1759" height="631" alt="image" src="https://github.com/user-attachments/assets/4a52ddcd-6428-4140-a2c4-8c8dd872a3ba" />


- **Update Availability**
  
 <img width="1747" height="708" alt="image" src="https://github.com/user-attachments/assets/af45b69b-6f26-4c50-98d5-ecf3a050591b" />

---

## 📦 Postman Collection

You can download and test all API endpoints using the Postman collection below:

👉 [Click here to access the Postman Collection](https://www.postman.com/yashrajvardhan/yash-raj-vardhan-s-workspace/collection/4hdom49/new-collection?action=share&creator=45324779)

> 💡 Import the collection into Postman and start testing the API with predefined requests.

---

## 🚀 Run the Project

### 1. Clone the repository:

```bash
git clone https://github.com/your-username/Library.git

```

### 2. Navigate into the project folder:

```bash

cd Library

```

### 3. Ensure MySQL is running and the library database is created.

### 4. Run the application:

```bash

./mvnw spring-boot:run
 
```
### or with Maven installed

```bash

mvn spring-boot:run
```
---
## 👤 Author

**Yash Raj Vardhan**  
📧 Feel free to reach out for questions, feedback, or contributions.
