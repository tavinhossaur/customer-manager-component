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
    <id>github</id>
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
