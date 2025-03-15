# Spring Boot Project with CI/CD using Jenkins

This project is a simple Java application developed using the Spring Boot framework. The main objective of this project is to test and implement CI/CD (Continuous Integration and Continuous Deployment) concepts.

## Features

- **Continuous Integration (CI)**: The project is configured to be integrated and tested on Jenkins. The `Jenkinsfile` contains a script that automates the CI/CD process for this application.
- **Continuous Deployment (CD)**: The CI/CD process includes the following basic steps:
  - **Build**: Compilation of the source code.
  - **Test**: Execution of automated tests to verify code quality.
  - **Deployment**: Deployment of the application to a target environment.

## Prerequisites

- Java JDK 8 or higher
- Maven
- Jenkins
- A deployment environment (e.g., Tomcat server, Docker, etc.)

## Configuration

1. **Jenkins**: Ensure Jenkins is installed and configured on your machine or server.
2. **Jenkinsfile**: The `Jenkinsfile` must be placed at the root of the project. It contains the build, test, and deployment steps.
3. **Dependencies**: Project dependencies are managed by Maven. Ensure the `pom.xml` file is properly configured.

## Usage

- Clone this repository to your local machine:
   ```bash
   git clone https://github.com/your-username/your-project.git