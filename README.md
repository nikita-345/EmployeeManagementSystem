# 👨‍💼 Employee Management System

### A Spring Boot REST API for Managing Employee Records

A Java-based Employee Management System built with **Spring Boot, Spring Data JPA, Hibernate, and MySQL**. This project provides REST APIs to create, view, update, delete, and search employee records.

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/MySQL-8.4-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
  <img src="https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
</p>

---

## 📌 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Database Configuration](#-database-configuration)
- [API Documentation](#-api-documentation)
- [Sample Request](#-sample-request)
- [Future Improvements](#-future-improvements)
- [Author](#-author)

## 🚀 Overview

The Employee Management System simplifies employee record management through RESTful APIs. It uses a layered architecture to separate controller, service, repository, and entity responsibilities.

Employee information includes personal details, contact information, salary, department, designation, joining date, reporting manager, and work location.

## ✨ Features

- ➕ **Add Employee** — Create a new employee record.
- 📋 **View All Employees** — Retrieve all employee records.
- 🔍 **Find Employee by ID** — Retrieve a specific employee.
- ✏️ **Update Employee** — Update an existing employee record.
- 🗑️ **Delete Employee** — Remove an employee using their ID.
- 👤 **Search by First Name** — Find employees by first name.
- 👥 **Search by Last Name** — Find employees by last name.
- 🏢 **Search by Department** — Filter employees by department.
- 💼 **Search by Designation** — Find employees by job designation.
- 🗄️ **Database Integration** — Store records in MySQL using Spring Data JPA.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Boot 4.0.2 | Application framework |
| Spring Web MVC | REST API development |
| Spring Data JPA | Database access |
| Hibernate | ORM |
| MySQL 8.x | Relational database |
| Maven | Build and dependency management |
| Postman | API testing |

## 📂 Project Structure

```text
EmployeeManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/in/ps/main/
│   │   │   ├── EmployeeManagementSystemApplication.java
│   │   │   ├── controller/
│   │   │   │   └── EmployeeController.java
│   │   │   ├── entity/
│   │   │   │   └── Employee.java
│   │   │   ├── repository/
│   │   │   │   └── EmployeeRepository.java
│   │   │   └── service/
│   │   │       └── EmployeeService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## ⚙️ Getting Started

### Prerequisites

Install the following software before running the project:

- [Java JDK 21](https://adoptium.net/)
- [MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
- [Git](https://git-scm.com/)
- [Postman](https://www.postman.com/downloads/) (optional, for testing APIs)

### 1. Clone the Repository

```bash
git clone https://github.com/nikita-345/EmployeeManagementSystem.git
```

### 2. Open the Project

```bash
cd EmployeeManagementSystem
```

Open the project in Eclipse, IntelliJ IDEA, or Visual Studio Code.

### 3. Create the Database

Log in to MySQL and execute:

```sql
CREATE DATABASE empmanagementsystem;
```

### 4. Configure Database Credentials

Open `src/main/resources/application.properties` and configure your local MySQL credentials:

```properties
spring.application.name=EmployeeManagementSystem

spring.datasource.url=jdbc:mysql://localhost:3306/empmanagementsystem
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set `DB_USERNAME` and `DB_PASSWORD` to your MySQL credentials in your local environment before running the application.

**Security note:** Never commit database passwords, API keys, or other secrets to GitHub.

### 5. Run the Application

On Windows CMD:

```cmd
mvnw.cmd spring-boot:run
```

Alternatively, if Maven is installed:

```bash
mvn spring-boot:run
```

Once the application starts, the APIs will normally be available at:

```text
http://localhost:8080
```

## 🔗 API Documentation

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/addemp` | Add a new employee |
| GET | `/findallemp` | Get all employees |
| GET | `/findempbyid?empid=1` | Find employee by ID |
| PUT | `/updateemp?empid=1` | Update employee by ID |
| DELETE | `/deleteempbyid?empid=1` | Delete employee by ID |
| GET | `/findbyfirstname?firstname=Rahul` | Search by first name |
| GET | `/findbylastname?lastname=Sharma` | Search by last name |
| GET | `/findbydepartment?department=IT` | Search by department |
| GET | `/findbydesignation?designation=Developer` | Search by designation |

## 🧪 Sample Request

### Add an Employee

**Request**

```http
POST http://localhost:8080/addemp
Content-Type: application/json
```

**JSON Body**

```json
{
  "firstname": "Rahul",
  "middlename": "Kumar",
  "lastname": "Sharma",
  "gender": "Male",
  "email": "rahul@example.com",
  "dob": "2000-05-15",
  "contactno": 9876543210,
  "adharno": 123456789012,
  "panno": "ABCDE1234F",
  "address": "Pune, Maharashtra",
  "profile": "Backend Developer",
  "exp": 2,
  "salary": 45000,
  "joiningdate": "2025-01-15",
  "department": "IT",
  "designation": "Java Developer",
  "reportingmanager": "Team Lead",
  "status": "Active",
  "worklocation": "Pune"
}
```

**Expected response**

```text
Employee record added sucessfully
```

Use fictional data when testing. The sample contains personal-information fields, so avoid sending real identity details to public environments.

### Get All Employees

```http
GET http://localhost:8080/findallemp
```

### Update an Employee

```http
PUT http://localhost:8080/updateemp?empid=1
Content-Type: application/json
```

Send the employee JSON in the request body.

### Delete an Employee

```http
DELETE http://localhost:8080/deleteempbyid?empid=1
```

You can test these endpoints in Postman by selecting the HTTP method, entering the URL, and adding JSON under **Body → raw → JSON** when required.

## 🔮 Future Improvements

- Add Spring Security and role-based access control.
- Implement request validation and global exception handling.
- Add pagination and sorting for employee records.
- Introduce Swagger/OpenAPI documentation.
- Build a React frontend dashboard.
- Add automated unit and integration tests.
- Containerize the application using Docker.

## 👨‍💻 Author

**Repository:** [EmployeeManagementSystem](https://github.com/nikita-345/EmployeeManagementSystem)

If you find this project useful, consider giving the repository a ⭐ on GitHub.

---

<p align="center">
  <b>Built with Java ☕ and Spring Boot 🌱</b>
</p>
