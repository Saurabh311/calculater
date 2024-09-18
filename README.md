# Calculator API

A simple calculator API built using **Java 21** and **Spring Boot** that supports basic arithmetic operations. This project demonstrates the use of REST endpoints for performing and storing calculations. Each operation is accessed via dedicated endpoints, and calculation history is stored in memory and returned in JSON format.

## Features

- Supports the four basic operations:
  - Addition (`+`)
  - Subtraction (`-`)
  - Multiplication (`*`)
  - Division (`/`)
- Handles **division by zero** with appropriate error response.
- Persist calculations in memory.
- Fetch all previously made calculations in **JSON format**.
- Unit tested using **JUnit 5**.

## Technologies Used

- **Java 21**
- **Spring Boot 3.x**
- **Maven** (for dependency management)
- **JUnit 5** (for unit testing)

## Endpoints

The API exposes the following endpoints:

### Arithmetic Operations

Each arithmetic operation returns a **plain text** result.

1. **Addition**
   - **Method**: `GET`
   - **URL**: `/api/calculate/add`
   - **Parameters**: `number1`, `number2` (double)
   - **Example**: `/api/calculate/add?number1=5&number2=10`
   - **Response**: `15`

2. **Subtraction**
   - **Method**: `GET`
   - **URL**: `/api/calculate/subtract`
   - **Parameters**: `number1`, `number2` (double)
   - **Example**: `/api/calculate/subtract?number1=10&number2=3`
   - **Response**: `7`

3. **Multiplication**
   - **Method**: `GET`
   - **URL**: `/api/calculate/multiply`
   - **Parameters**: `number1`, `number2` (double)
   - **Example**: `/api/calculate/multiply?number1=7&number2=6`
   - **Response**: `42`

4. **Division**
   - **Method**: `GET`
   - **URL**: `/api/calculate/divide`
   - **Parameters**: `number1`, `number2` (double)
   - **Example**: `/api/calculate/divide?number1=20&number2=5`
   - **Response**: `4.0`

   **Note**: Division by zero will return an error message in plain text:
   ```text
   NaN

### History of Calculations

The history of all calculations is returned in **JSON format**.

#### Get Calculation History

- **Method**: `GET`
- **URL**: `/api/calculate/history`
- **Response** (Example):
  
  ```json
  [
    {
      "operation": "add",
      "number1": 5,
      "number2": 10,
      "result": 15
    },
    {
      "operation": "subtract",
      "number1": 10,
      "number2": 3,
      "result": 7
    },
    {
      "operation": "multiply",
      "number1": 7,
      "number2": 6,
      "result": 42
    }
  ]
