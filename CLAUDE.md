# Claude Code Project Configuration

This file helps Claude Code understand and work with your Java Spring Boot project more effectively.

## Project Overview

This is a **Spring Boot 3.4.3** web application built with **Java 21** and **Maven**. The project provides a demo CRUD application with REST API endpoints and static HTML/JavaScript frontend using ExtJS 4.1.

**Main Application:** `src/main/java/geminitest/My_geminitest_Application.java`

## Key Technologies & Dependencies

- **Backend:** Java 21, Spring Boot 3.4.3, Spring AOP
- **Build Tool:** Maven
- **Frontend:** Static HTML, JavaScript, ExtJS 4.1
- **Libraries:** FastJSON 2.0.56, Apache Commons Lang3, Commons IO, Guava, OkHttp3
- **Testing:** JUnit

## Project Structure

```
src/main/java/geminitest/
├── My_geminitest_Application.java    # Main Spring Boot application
├── common/                           # Common utilities and aspects
├── config/                          # Configuration classes
├── controller/                      # REST controllers
├── model/                          # Data models
├── service/                        # Business logic services
└── utils/                          # Utility classes

src/main/resources/
├── application.properties          # Application configuration
├── static/                        # Static web resources
└── templates/                     # Template files
```

## Build & Run Commands

```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run

# Run tests
mvn test

# Package as JAR
mvn clean package
```

## API Documentation

The application provides REST endpoints under `/demo` for CRUD operations on Demo entities. See `API.md` for detailed endpoint documentation.

## Development Notes

- Uses UTF-8 encoding configuration
- AOP enabled with `@EnableAspectJAutoProxy`
- Dev tools included for development (not for production)
- Servlet component scanning enabled for `geminitest` package
- Static resources served from `src/main/resources/static/`

## File Locations

- **Controllers:** `src/main/java/geminitest/controller/`
- **Models:** `src/main/java/geminitest/model/`
- **Services:** `src/main/java/geminitest/service/`
- **Tests:** `src/test/java/geminitest/`
- **Static Web:** `src/main/resources/static/`
- **Config:** `src/main/resources/application.properties`

## Testing

Unit tests are located in `src/test/java/geminitest/` with JUnit framework.