# Employee Management System

This project is an Employee Management System built using Spring Boot and MySQL. It provides CRUD (Create, Read, Update, Delete) operations for managing employee records.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Features

- **Create Employee**: Add a new employee to the system.
- **Read Employees**: Retrieve all employees from the database.
- **Update Employee**: Update an existing employee's information.
- **Delete Employee**: Remove an employee from the system by their ID.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java 11 or higher
- Maven
- MySQL

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/akshat433/EmployeeDatabase.git
   cd employee-management-system
   ```

2. **Set up MySQL Database**:
   - Create a MySQL database named `emp_db`.
   - Update `application.properties` with your database username and password.

3. **Run the Application**:
   - Build the project using Maven:
     ```bash
     mvn clean install
     ```
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

4. **Access the Application**:
   - The application will be accessible at `http://localhost:8080`.

5. **API Endpoints**:
   - **GET** `/employees`: Retrieve all employees.
   - **POST** `/employees`: Create a new employee.
   - **DELETE** `/employees/{id}`: Delete an employee by ID.
   - **PUT** `/employees/{id}`: Update an existing employee by ID.

## Contributing

Contributions are welcome! Feel free to open issues and pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
