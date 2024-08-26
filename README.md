# Hibernate Projects

## Project Overview

This repository contains multiple projects that demonstrate different aspects of Hibernate, a popular Object-Relational Mapping (ORM) framework for Java. The projects showcase how Hibernate can be used to interact with relational databases in a Java application, focusing on CRUD operations, entity relationships, and more. The purpose of these projects is to deepen understanding of Hibernate and ORM concepts.

## Key Features

- **Entity Mapping**: Demonstrates the mapping of Java objects to database tables.
- **CRUD Operations**: Implementation of Create, Read, Update, and Delete functionalities using Hibernate.
- **Entity Relationships**: Covers One-to-One, One-to-Many, and Many-to-Many relationships.
- **Database Configuration**: Integrates with relational databases such as MySQL.
- **Learning-Focused**: Projects were developed as part of a learning journey to grasp Hibernate concepts.

## Database Relational Map
1. One-to-One
2. One-to-Many
3. Many-to-One
4. Many-to-Many


## Technologies Used

- **Java 17**
- **Hibernate 5.x**
- **MySQL**
- **Maven**
- **JPA Annotations**

## Project Structure and Code Explanation

1. **Entity Classes**:
   - Represents the database tables and are mapped using JPA annotations.
   ```java
   @Entity
   @Table(name = "entity_table")
   public class EntityClass {
       // Fields, Getters, Setters, and Mappings
   }
   ```

2. **Hibernate Configuration**:
   - The `hibernate.cfg.xml` file is used to configure the database connection and Hibernate properties.
   ```xml
   <hibernate-configuration>
       <session-factory>
           <!-- Database connection settings -->
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hibernate_db</property>
           <!-- Other properties -->
       </session-factory>
   </hibernate-configuration>
   ```

3. **DAO Classes**:
   - Data Access Object classes that handle CRUD operations using Hibernate SessionFactory.
   ```java
   public class EntityDAO {
       // Methods for CRUD operations
   }
   ```

## Committing Strategy and Learning Insights

This repository follows a structured commit strategy to document the learning journey:
- **Initial Setup Commits**: Focus on project scaffolding, setting up Hibernate configuration files, and integrating database connections.
- **Feature Addition Commits**: Each commit aligns with the addition of a specific feature (e.g., One-to-Many relationship mapping) to demonstrate incremental learning.
- **Bug Fix and Refactor Commits**: Commit messages detail the resolution of issues encountered while learning concepts such as lazy loading, eager fetching, and session management.
- **Documentation and Comment Commits**: Includes commits aimed at enhancing the codebase with comments and documentation to reinforce understanding.

These commit patterns not only track progress but also highlight the learning curve associated with mastering Hibernate’s core concepts.

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/MalingaBandara/hibernate-projects.git
   ```
2. Set up the MySQL database and update the `hibernate.cfg.xml` with your configurations.
3. Run the application using Maven:
   ```bash
   mvn clean install
   ```

## Purpose and Future Enhancements

These projects were developed as part of a learning journey to understand Hibernate and ORM concepts. Future enhancements could include exploring advanced Hibernate features such as caching, fetching strategies, and criteria queries.

## License

This project is licensed under the MIT License.
