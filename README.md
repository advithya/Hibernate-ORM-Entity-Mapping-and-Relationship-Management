# 🏗️ Hibernate ORM: Complete Entity Mapping & Relationship Management

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://java.com)
[![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)](https://hibernate.org)
[![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org)

A comprehensive Hibernate ORM implementation demonstrating Java persistence from basic entity mapping to advanced database relationships using JPA annotations.

## 📸 Project Demo Outputs

### 🔹 One-to-Many Relationship (Question-Answer)
![One-to-Many Output](Screenshot%202025-10-16%20215026.png)
- Demonstrates bidirectional One-to-Many relationship
- Shows lazy loading of associated answers
- Cascade operations for automatic persistence

### 🔹 Many-to-Many Relationship (Developer-Project)  
![Many-to-Many Output](Screenshot%202025-10-16%20215053.png)
- Implements Many-to-Many with join table
- Bidirectional relationship navigation
- Shows fetching projects for developers and vice versa

### 🔹 Basic Entity Operations (Employee CRUD)
![Basic CRUD Output](Screenshot%202025-10-16%20215212.png)
- Basic entity mapping with `@Entity` and `@Id`
- Hibernate session management
- Simple INSERT operations

### 🔹 Embedded Objects (Student-Course)
![Embedded Objects Output](Screenshot%202025-10-16%20215539.png)
- Demonstrates `@Embeddable` and `@Embedded` annotations
- Component mapping without separate table
- Object retrieval with embedded properties

## 🏗️ Projects Structure

### **HibernateTask1 - Basic Entity Mapping & Embedded Objects**
```
HibernateTask1/
├── Entity Classes/
│   ├── Employee.java          - Basic entity with @Id
│   ├── Student.java           - Entity with @Embedded
│   └── Course.java            - @Embeddable class
├── Demo Classes/
│   ├── HibernateCreate.java   - Basic CRUD operations
│   └── EmbedableDemo.java     - Embedded object demo
└── Configuration/
    └── Hibernate.cfg.xml      - Hibernate configuration
```

### **HibernateTask2 - Advanced Relationship Mapping**
```
HibernateTask2/
├── Entity Classes/
│   ├── Person.java + BloodGroup.java    - One-to-One
│   ├── Question.java + Answer.java      - One-to-Many  
│   ├── Developer.java + Project.java    - Many-to-Many
├── Demo Classes/
│   ├── OneToOneDemo.java
│   ├── OneToMany.java
│   └── ManyToManyDemo.java
└── Configuration/
    └── hibernate.cfg.xml
```

## 🛠️ Technologies Used

- **Java** - Core programming language
- **Hibernate 5.6.15.Final** - ORM framework
- **MySQL** - Database management system
- **Maven** - Dependency management
- **JPA Annotations** - Entity mapping standards
- **Hibernate Configuration** - XML-based configuration

## 🎯 Key Features Implemented

### ✅ Basic ORM Concepts
- Entity mapping with `@Entity`, `@Table`, `@Id`
- Hibernate configuration (`hibernate.cfg.xml`)
- SessionFactory and Session management
- Basic CRUD operations

### ✅ Embedded Objects
- `@Embeddable` and `@Embedded` annotations
- Component mapping without separate tables
- Object composition in database

### ✅ Relationship Mapping
- **One-to-One**: Person ↔ BloodGroup
- **One-to-Many**: Question ↔ Answer (with cascade operations)
- **Many-to-Many**: Developer ↔ Project (with join table)
- Bidirectional relationships with `mappedBy`
- Cascade operations (`CascadeType.ALL`)

### ✅ Advanced Hibernate Features
- Lazy loading vs Eager loading
- Transaction management
- HQL and native SQL queries
- Automatic schema generation (`hbm2ddl.auto`)

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- MySQL Server
- Maven
- IDE (Eclipse/IntelliJ/VS Code)

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/advithya/Hibernate-ORM-Entity-Mapping-and-Relationship-Management.git
   cd Hibernate-ORM-Entity-Mapping-and-Relationship-Management
   ```

2. **Database Configuration**
   ```sql
   CREATE DATABASE dboct25;
   ```
   Update `hibernate.cfg.xml` with your MySQL credentials:
   ```xml
   <property name="connection.url">jdbc:mysql://localhost:3306/dboct25</property>
   <property name="connection.username">your_username</property>
   <property name="connection.password">your_password</property>
   ```

3. **Run the Projects**
   - Import as Maven project in your IDE
   - Execute demo classes in order:
     - Start with `HibernateCreate` (Basic CRUD)
     - Then `EmbedableDemo` (Embedded objects)
     - Advanced relationships: `OneToOneDemo`, `OneToMany`, `ManyToManyDemo`

## 📊 Hibernate Configuration

### Example `hibernate.cfg.xml`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- Database Connection -->
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/dboct25</property>
        <property name="connection.username">root</property>
        <property name="connection.password">****</property>
        
        <!-- Hibernate Settings -->
        <property name="dialect">org.hibernate.dialect.MySQL5InnoDBDialect</property>
        <property name="hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
        
        <!-- Entity Mappings -->
        <mapping class="com.sample.Employee"/>
        <mapping class="com.sample.Student"/>
    </session-factory>
</hibernate-configuration>
```

## 💡 Key Hibernate Concepts Demonstrated

### 🔸 ORM (Object-Relational Mapping)
- Maps Java objects to database tables automatically
- Eliminates manual SQL writing
- Manages object-relational impedance mismatch

### 🔸 JPA Annotations Used
- `@Entity`, `@Table`, `@Id`, `@Column`
- `@Embeddable`, `@Embedded`
- `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`
- `@JoinColumn`, `mappedBy`, `cascade`

### 🔸 Hibernate Session Management
```java
SessionFactory factory = new Configuration().configure().buildSessionFactory();
Session session = factory.openSession();
Transaction transaction = session.beginTransaction();

// Perform operations
session.save(entity);

transaction.commit();
session.close();
```

## 🎓 Learning Outcomes

### Technical Skills
- ✅ Complete Hibernate ORM implementation
- ✅ Database relationship mapping
- ✅ JPA annotation usage
- ✅ Session and transaction management
- ✅ Maven project structure
- ✅ MySQL database integration

### Conceptual Understanding
- ✅ ORM principles and benefits
- ✅ Entity lifecycle management
- ✅ Lazy vs Eager loading strategies
- ✅ Cascade operations and ownership
- ✅ Bidirectional relationship management

## 📈 Project Highlights

### Real-World Scenarios Implemented
- **Employee Management System** - Basic CRUD operations
- **Student Course Enrollment** - Embedded object composition
- **Q&A Platform** - One-to-Many relationships
- **Project Management** - Many-to-Many team assignments
- **Person Profile System** - One-to-One relationships

### Enterprise-Ready Features
- Proper exception handling
- Transaction management
- Connection pooling
- Schema auto-generation
- Production-like configuration

## 🤝 Contributing

Feel free to fork this repository and submit pull requests for any improvements.



## 👨‍💻 Author

**Advithya**  
- GitHub: [@advithya](https://github.com/advithya)
- Project Repository: [Hibernate ORM Projects](https://github.com/advithya/Hibernate-ORM-Entity-Mapping-and-Relationship-Management)

---

### ⭐ If you find this project helpful, please give it a star on GitHub!

**Happy Coding! 🚀**
