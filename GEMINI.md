# Gemini Project Configuration

This file, `GEMINI.md`, helps the Gemini agent understand and interact with your project more effectively.

## Project Overview

This is a web application built with **Java 21** and **Spring Boot 3.4.3**, using **Maven** for dependency management and builds.

The core functionality revolves around CRUD (Create, Read, Update, Delete) operations for a "Demo" entity. The application exposes RESTful endpoints and serves a static frontend for interaction.

## Key Technologies

- **Backend:** Java 21, Spring Boot 3.4.3
- **Build:** Maven
- **Frontend:** Static HTML, JavaScript

## Commands

- **Build the project:**
  ```bash
  mvn clean install
  ```
- **Run the application:**
  ```bash
  mvn spring-boot:run
  ```
- **Run tests:**
  ```bash
  mvn test
  ```