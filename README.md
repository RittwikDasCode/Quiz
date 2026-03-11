# Quiz Application - Microservices Architecture

A Quiz Application built using **Spring Boot Microservices architecture**.
The system is divided into independent services that communicate through Feign Client and are managed using a service registry and API gateway.

---

## 📌 Project Overview

This project demonstrates a **Microservices-based backend system** for a quiz platform where users can create quizzes and answer questions.

The application is split into multiple independent services to improve **scalability, maintainability, and fault isolation**.

---

## 🏗 Architecture

The system consists of the following components:

Client
↓
API Gateway
↓
Service Registry (Eureka)
↓
Quiz Service ↔ Question Service
↓
Database

---

## 🚀 Microservices

### 1. API Gateway

* Acts as the **single entry point** for all client requests.
* Routes incoming requests to the appropriate microservice.
* Handles centralized concerns like routing and filtering.

### 2. Service Registry

* Implemented using **Eureka Server**.
* Allows services to **register themselves dynamically**.
* Enables **service discovery** between microservices.

### 3. Question Service

Responsible for:

* Managing quiz questions
* CRUD operations for questions
* Fetching questions by category or difficulty

### 4. Quiz Service

Responsible for:

* Creating quizzes
* Fetching questions from Question Service
* Calculating quiz scores

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Cloud
* Eureka Service Registry
* Spring Cloud Gateway
* Spring Data JPA
* H2-Console
* Maven

---

## 🔗 Inter-Service Communication

The services communicate using **Feign Client**.

Example flow:

User → API Gateway → Quiz Service
Quiz Service → Question Service
Question Service → Database

---

## ⚙️ Key Features

* Microservices-based architecture
* Service discovery using Eureka
* Centralized API routing via API Gateway
* Independent service deployment
* Feign Client
* Database integration with Spring Data JPA

---

## 📂 Project Structure

API Gateway
Question Service
Quiz Service
Service Registry

Each service is an independent **Spring Boot application**.

---

## 📜 License

This project is created for **learning and demonstration purposes**.
