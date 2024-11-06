# School Attendance Management System

This project is a school attendance management system designed to handle student attendance efficiently. It includes a back-end API developed with Spring Boot, a front-end built with ReactJS, and utilizes JWT for authentication. Postman was used for testing the API endpoints.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
## Project Overview

The School Attendance Management System enables schools to manage student attendance securely and efficiently. Users (e.g., teachers or school admins) log in with a username and password to gain access to attendance management functions. The back-end API generates a JWT token upon successful authentication.

## Features

- User authentication with JWT tokens
- POST and GET FOR  operations for managing attendance records
- Separate views for home and login
- Protected routes requiring JWT authentication

## Technology Stack

### Back End
- **Spring Boot** - Java-based framework for building RESTful APIs
- **JWT (JSON Web Tokens)** - For secure authentication and authorization

### Front End
- **ReactJS** - JavaScript library for building user interfaces

### Testing
- **Postman** - For API testing and request simulation

## Setup and Installation

1. **Clone the repository**
    ```bash
   https://github.com/darship19/attendance-system.git
    cd attendance-system
    ```

2. **Back-End Setup (Spring Boot)**
    - Navigate to the `backend` folder.
    - Install dependencies and build the application.
    - Configure application properties such as database and JWT secret in `application.properties`.
    - Start the Spring Boot application.
    
    ```bash
    cd backend
    ./mvnw spring-boot:run
    ```

3. **Front-End Setup (ReactJS)**
    - Navigate to the `frontend` folder.
    - Install dependencies and start the development server.
    
    ```bash
    cd frontend
    npm install
    npm start
    ```

## Usage

- **Login**: The user provides a username and password. Upon successful login, the API returns a JWT token.
- **Attendance Management**: Access protected routes to manage student attendance, accessible only after logging in.

## Screenshots
### Login Page
![Login](./doc/LoginPage.png)

### Home Page
![Home](./doc/Home.png)



## API Endpoints

| Method | Endpoint           | Description                                  |
|--------|---------------------|----------------------------------------------|
| POST   | `/api/login`  | Authenticate user and generate JWT token     |
| GET    | `/api/home`  | mark attendance |


## Testing

- **Postman** was used for testing the API endpoints.
- Use the JWT token received from `/api/login` to authenticate requests to protected routes.


