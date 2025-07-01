# Customer Manager Component

A modular Java component for managing customer data, designed with a focus on clean architecture and component-based development. This project demonstrates the use of the "Beyond" component structure by implementing interfaces, ports, and adapters to provide a flexible and extensible customer management solution.

## Project Structure

```bash
customer-manager-component/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/ifsp/tavinho/customer_manager_component/
│   │           ├── internal/               # Core business logic (CustomerManager)
│   │           ├── provided/               # Provided interfaces and ports
│   │           └── required/               # Required interfaces and outbox ports
│   └── test/                               # Unit tests
├── pom.xml                                 # Maven configuration
```

## Main Classes

- `CustomerManager`: Core class for managing customers (add, list, count).
- `CustomerManagerInterface`: Component interface exposing customer management operations.
- `CustomerManagerInterfacePort`: Port for interacting with the customer manager.
- `ProvidedCustomerManagerInterface`: Interface defining provided customer operations.
- `RequiredCustomerManager`: Interface for required customer operations (for extensibility).

## Component Architecture Criteria Analysis

This project was evaluated according to key component-based architecture criteria, as follows:

### CR3: Correct Implementation of the Component Interface Pattern

- The project implements the component interface pattern using provided and required interfaces.
- The `CustomerManagerInterface` class extends a base `ComponentInterface` from beyond-boilerplate and initializes a port (`CustomerManagerInterfacePort`) that exposes the component's operations.
- The use of ports and interface references ensures proper encapsulation and decoupling, following best practices for component-based design.

### CR4: Proper Application of SOLID Principles

- **Single Responsibility Principle:** Each class has a clear, focused responsibility (e.g., `CustomerManager` handles only the customer logic, ports handle communication).
- **Open/Closed Principle:** The use of interfaces and ports (e.g., `ProvidedCustomerManagerInterface` and `CustomerManagerInterfacePort`) allows for extension without modifying existing code.
- **Liskov Substitution Principle:** Interfaces are respected and can be substituted by any compliant implementation (e.g., any class implementing `RequiredCustomerManager`).
- **Interface Segregation Principle:** Interfaces are specific and cohesive, tailored to the component's domain (e.g., `RequiredCustomerManager` define only customer-related operations).
- **Dependency Inversion Principle:** High-level modules depend on abstractions (interfaces), not concrete implementations (e.g., `CustomerManagerInterfacePort` depends on the `CustomerManager` reference via the interface, and can work with any implementation of the interface).

### CR5: Correct Use of Build/Dependency System and Repository Deployment

- The project uses Maven for build and dependency management.
- The `pom.xml` is configured for deployment to a remote repository (GitHub Packages).
- All dependencies and build properties are properly declared, ensuring an easy integration.

### CR6: Functional Testing (Unit or Integration) with Coupling

- The project includes unit tests for both the core logic (`CustomerManager`) and the component interface port (`CustomerManagerInterfacePort`).
- Tests demonstrate the use of the component via its interface, simulating real-world coupling and integration scenarios.

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+

### Installation

To use this component in your own Maven project, add the following to your `pom.xml`:

- Add the GitHub Packages repository:

```xml
<repositories>
  <repository>
    <id>customer-manager-component</id>
    <url>https://maven.pkg.github.com/tavinhossaur/customer-manager-component</url>
  </repository>
</repositories>
```

- Add the dependency:

```xml
<dependency>
  <groupId>com.ifsp.tavinho</groupId>
  <artifactId>customer-manager-component</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Build

```bash
mvn clean install
```

### Run Tests

```bash
mvn test
```

## License

This project is licensed under the MIT License.
