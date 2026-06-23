# Maven Project

A practice repository for learning and exploring **Apache Maven** — covering project setup, build lifecycle, and dependency management fundamentals.

## 📌 About

This repository was created to get hands-on experience with Maven as a build automation and project management tool for Java projects. It covers the basics of setting up a Maven project from scratch, understanding its standard directory structure, and working with the build lifecycle.

## 🛠️ Tech Stack

| Category | Tools / Frameworks |
|---|---|
| Language | Java |
| Build Tool | Apache Maven |

## 🎯 Topics Covered

- Maven project structure (standard directory layout)
- Understanding `pom.xml` — project configuration and dependency declarations
- Adding and managing project dependencies
- Maven build lifecycle phases (`validate`, `compile`, `test`, `package`, `install`)
- Running builds and basic project commands

## 📂 Project Structure

```
mavenproject/
├── src/
│   ├── main/java/        # Application source code
│   └── test/java/        # Test source code
├── pom.xml               # Maven project configuration
└── README.md
```

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or above
- Apache Maven installed and configured (`mvn -version` to verify)

### Setup
```bash
git clone https://github.com/MiruthyanJayanS/mavenproject.git
cd mavenproject
```

### Common Maven Commands
```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Package the project (e.g. into a JAR)
mvn package

# Clean build artifacts and rebuild
mvn clean install
```

## 🎯 Learning Outcomes

- Understood how Maven manages Java project builds and dependencies
- Got comfortable navigating and modifying `pom.xml`
- Learned the standard Maven build lifecycle and common commands

## 📄 License

This repository is for personal learning and reference purposes.
