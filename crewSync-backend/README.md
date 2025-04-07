
# CrewSync – HR Management Platform

CrewSync is a full-stack HR management system built with microservices architecture, featuring a Spring Boot backend and a Node.js attendance microservice.

## 🔧 Tech Stack

- **Spring Boot** (Java)
- **Node.js + Express** (Microservice)
- **MySQL** (Database)
- **JWT** (Authentication)
- **REST APIs**

---

## 📦 Modules

### ✅ Spring Boot Backend
- User Registration & Login (JWT secured)
- Role-based access: Admin, Manager, Employee
- Employee CRUD APIs
- Leave Management (Apply, Approve/Reject)
- Integrated with Attendance Microservice via REST

### ✅ Node.js Attendance Microservice
- Mark and View Attendance
- Lightweight Express server
- Receives REST calls from Spring Boot backend

---

## 🔗 Microservice Integration

Spring Boot calls Node.js via:
```
GET http://localhost:3000/api/attendance/{employeeId}
```

Use `/api/attendance/{id}` from Spring Boot, and it will fetch the data from the Node.js service.

---

## 🚀 Running the Project

### 1. Start MySQL
- Create a database: `crewsync`
- Update `application.properties` with your DB credentials

### 2. Run Spring Boot Backend
```bash
cd crewSync-backend
mvn spring-boot:run
```

### 3. Run Node.js Attendance Microservice
```bash
cd crewSync-attendance-microservice
npm install
node server.js
```

---

## 📬 API Endpoints (Spring Boot)
- `POST /api/auth/register` – User Registration
- `POST /api/auth/login` – Login & get JWT
- `GET /api/employees` – List all employees
- `POST /api/employees` – Add employee
- `GET /api/attendance/{id}` – Get attendance (via Node.js)

---

## 🧑‍💻 Author
**Surbhi**  
GitHub: [surbhimor11](https://github.com/surbhimor11)  
Email: surbhimor0@gmail.com



